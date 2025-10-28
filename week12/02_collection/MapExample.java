import java.util.*;

public class MapExample {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        // put
        map.put(1, "일요일");
        map.put(2, "월요일");
        map.put(7, "금요일");
        map.put(7, "불금"); // Key가 중복되면 Value가 덮어쓰기 됨

        // get
        System.out.println(map.get(2)); // 월요일

        // contains
        System.out.println(map.containsKey(3));    // false
        System.out.println(map.containsValue("월요일")); // true

        // keySet
        for (Integer key : map.keySet()) {
            System.out.println(key + " -> " + map.get(key));
        }

        // entrySet
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

        // Quiz
        map.forEach((i, day) -> System.out.println(i + day));
        //map.forEach((Number i, String day) -> System.out.println(i + day));
        /*
        map.forEach((i, day) -> {
            System.out.println(i + day);
        });
        */
    }
}
