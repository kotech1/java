import java.util.*;

public class SetExample {
    public static void main(String[] args) {
        // 배열에 중복된 값이 있음
        String[] fruits = {"apple", "banana", "apple", "orange", "banana"};

        // HashSet을 이용하면 자동으로 중복 제거됨
        Set<String> fruitSet = new HashSet<>(Arrays.asList(fruits));

        System.out.println(fruitSet); // [banana, orange, apple] 순서보장X
        fruitSet.add("banana");
        fruitSet.remove("apple");
        System.out.println(fruitSet.contains("apple")); // false
        Set<String> fruitSet2 = new HashSet<>(Arrays.asList("orange","banana"));
        System.out.println(fruitSet.equals(fruitSet2)); // true

        // List는 Iterable을 구현하므로 iterator() 사용 가능
        Iterable<String> iterable = Arrays.asList("A", "B", "C");

        Iterator<String> it = iterable.iterator();

        while (it.hasNext()) {
            String lang = it.next();
            System.out.println(lang);
        }
    }
}
