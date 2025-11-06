/*
출처: https://silverbullet.tistory.com/entry/Java-11에서-HttpClient를-사용한-REST-API-호출 [실버블렛  Insights:티스토리]
*/

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

class RestAPIGetExample {
    public static void main(String[] args) throws Exception {
        HttpClient httpClient = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                                .uri(URI.create("https://jsonplaceholder.typicode.com/posts/1"))
                                .GET()
                                .build();

        try {
            HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

            System.out.println(response.statusCode());
            System.out.println(response.body());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
