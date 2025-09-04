import java.util.*;

public class WildcardExample {
    static double sum(List<?> l) {
        double sum = 0.0;
        for (Object d : l) {
            Number n = (Number)d;
            sum += n.doubleValue();
        }
        return sum;
    }

    static double sumNum(List<? extends Number> l) {
        double sum = 0.0;
        for (Number n : l) 
            sum += n.doubleValue();
        return sum;
    }

    // 제네릭 메소드
    public static <T> void add(T n, List<? super T> l) {
        l.add(n); // 저장 시 업 캐스팅 가능 Number n = 3;
    }

    public static void main(String[] args) {
        List<Integer> l = Arrays.asList(3, 4);
        System.out.println(sum(l));
        List<Double> l2 = Arrays.asList(1.0, 1.1);
        System.out.println(sum(l2));
        List<Number> l3 = new ArrayList<>();
        add(5, l3);   // WildcardExample.<Integer>add(...)
        add(3.1, l3); // WildcardExample.<Double>add(...)
        System.out.println(l3); // [5, 3.1]
        // 런타임 오류
        //List<String> l4 = Arrays.asList("abc");
        //System.out.println(sum(l4));
        // 컴파일 오류
        //add("abc", l3);
    }
}
