import java.util.*;
class Quiz13 {
    public static void main(String[] args) {
        String body = "a=3&b=7&c=3&a=2";
        Map<String, String> map = new HashMap<>();
        for (String pair : body.split("&")) {
            String[] kv = pair.split("=");
            if (kv.length == 2) map.put(kv[0], kv[1]);
        }
        System.out.println(map.size());
        System.out.println(map);
    }
}
