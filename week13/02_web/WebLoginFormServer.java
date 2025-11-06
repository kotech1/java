import com.sun.net.httpserver.HttpServer;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpExchange;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class WebLoginFormServer {

    // 세션 저장소 (token → username)
    private static final Map<String, String> sessions = new HashMap<>();

    public static void main(String[] args) throws IOException {
        HttpServer server = HttpServer.create(new InetSocketAddress(8080), 0);

        server.createContext("/", new HtmlHandler());
        server.createContext("/login", new LoginHandler());
        server.createContext("/logout", new LogoutHandler());
        server.createContext("/profile", new ProfileHandler());

        server.start();
        System.out.println("서버 시작: http://localhost:8080");
    }

    // --------------------- Handlers ---------------------

    // HTML 페이지 (폼 추가)
    static class HtmlHandler implements HttpHandler {
        @Override
        public void handle(HttpExchange exchange) throws IOException {
            String html = """
                <!DOCTYPE html>
                <html lang="ko">
                <head>
                  <meta charset="UTF-8">
                  <title>Login Demo</title>
                </head>
                <body>
                  <div id="app"></div>
                  <script>
                    async function checkProfile() {
                      const res = await fetch('/profile', {credentials: 'include'});
                      const app = document.getElementById('app');
                      if (res.ok) {
                        const data = await res.json();
                        app.innerHTML = 
                          '<p>안녕하세요, ' + data.user + ' 님</p>' +
                          '<button onclick="logout()">Logout</button>';
                      } else {
                        app.innerHTML = `
                          <form onsubmit="return login(event)">
                            <label>Username: </label>
                            <input type="text" id="username">
                            <br><br>
                            <label>Password: </label>
                            <input type="password" id="password">
                            <br><br>
                            <button type="submit">Login</button>
                          </form>
                        `;
                      }
                    }

                    async function login(event) {
                      event.preventDefault();
                      const username = document.getElementById('username').value;
                      const password = document.getElementById('password').value;

                      const res = await fetch('/login', {
                        method: 'POST',
                        headers: {'Content-Type':'application/x-www-form-urlencoded'},
                        body: 'username=' + encodeURIComponent(username) + '&password=' + encodeURIComponent(password),
                        credentials: 'include'
                      });

                      const data = await res.json();
                      alert(data.message);
                      await checkProfile();
                      return false;
                    }

                    async function logout() {
                      await fetch('/logout', {
                        method: 'POST',
                        credentials: 'include'
                      });
                      await checkProfile();
                    }

                    checkProfile();
                  </script>
                </body>
                </html>
                """;

            byte[] bytes = html.getBytes(StandardCharsets.UTF_8);
            exchange.getResponseHeaders().add("Content-Type", "text/html; charset=utf-8");
            exchange.sendResponseHeaders(200, bytes.length);
            try (OutputStream os = exchange.getResponseBody()) {
                os.write(bytes);
            }
        }
    }

    // 로그인 처리
    static class LoginHandler implements HttpHandler {
        @Override
        public void handle(HttpExchange exchange) throws IOException {
            if (!"POST".equalsIgnoreCase(exchange.getRequestMethod())) {
                exchange.sendResponseHeaders(405, -1);
                return;
            }

            String body = new String(exchange.getRequestBody().readAllBytes(), StandardCharsets.UTF_8);
            Map<String, String> params = parseParams(body);
            String username = params.get("username");
            String password = params.get("password");

            String res;
            if ("user".equals(username) && "pass".equals(password)) {
                String token = UUID.randomUUID().toString();
                sessions.put(token, username);
                exchange.getResponseHeaders().add("Set-Cookie", "Session-Token=" + token + "; HttpOnly");
                res = "{\"message\":\"로그인 성공\"}";
                exchange.sendResponseHeaders(200, res.getBytes().length);
            } else {
                res = "{\"message\":\"로그인 실패\"}";
                exchange.sendResponseHeaders(401, res.getBytes().length);
            }

            try (OutputStream os = exchange.getResponseBody()) {
                os.write(res.getBytes());
            }
        }
    }

    // 로그아웃 처리
    static class LogoutHandler implements HttpHandler {
        @Override
        public void handle(HttpExchange exchange) throws IOException {
            if (!"POST".equalsIgnoreCase(exchange.getRequestMethod())) {
                exchange.sendResponseHeaders(405, -1);
                return;
            }

            String cookieHeader = exchange.getRequestHeaders().getFirst("Cookie");
            String token = getTokenFromCookie(cookieHeader);

            String res;
            if (token != null && sessions.remove(token) != null) {
                exchange.getResponseHeaders().add("Set-Cookie", "Session-Token=deleted; Max-Age=0");
                res = "{\"message\":\"로그아웃 성공\"}";
                exchange.sendResponseHeaders(200, res.getBytes().length);
            } else {
                res = "{\"message\":\"로그아웃 실패\"}";
                exchange.sendResponseHeaders(400, res.getBytes().length);
            }

            try (OutputStream os = exchange.getResponseBody()) {
                os.write(res.getBytes());
            }
        }
    }

    // 프로필 조회
    static class ProfileHandler implements HttpHandler {
        @Override
        public void handle(HttpExchange exchange) throws IOException {
            if (!"GET".equalsIgnoreCase(exchange.getRequestMethod())) {
                exchange.sendResponseHeaders(405, -1);
                return;
            }

            String cookieHeader = exchange.getRequestHeaders().getFirst("Cookie");
            String token = getTokenFromCookie(cookieHeader);

            String res;
            if (token != null && sessions.containsKey(token)) {
                String username = sessions.get(token);
                res = "{\"user\":\"" + username + "\"}";
                exchange.sendResponseHeaders(200, res.getBytes().length);
            } else {
                res = "{\"message\":\"인증 실패\"}";
                //exchange.getResponseHeaders().add("Content-Type", "application/json; charset=utf-8");
                exchange.sendResponseHeaders(401, res.getBytes().length);
            }

            try (OutputStream os = exchange.getResponseBody()) {
                os.write(res.getBytes());
            }
        }
    }

    // --------------------- Helpers ---------------------

    private static Map<String, String> parseParams(String body) {
        Map<String, String> map = new HashMap<>();
        for (String pair : body.split("&")) {
            String[] kv = pair.split("=");
            if (kv.length == 2) map.put(kv[0], kv[1]);
        }
        return map;
    }

    private static String getTokenFromCookie(String cookieHeader) {
        if (cookieHeader == null) return null;
        for (String cookie : cookieHeader.split(";")) {
            String[] kv = cookie.trim().split("=");
            if (kv.length == 2 && kv[0].equals("Session-Token")) {
                return kv[1];
            }
        }
        return null;
    }
}

