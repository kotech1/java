package listexample;
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

    // producer extends consumer super
    // 값을 꺼낼 때 extends 사용 -> 값을 내 보내므로 생산(producer)
    static double sumNum(List<? extends Number> l) {
        double sum = 0.0;
        //Number x = l.get(0);
        //System.out.println(x.getClass());
        for (Number n : l) {
            sum += n.doubleValue();
        } 
        return sum;
    }

    // 저장 할 때 super 사용 -> 객체가 값을 소모(consumer)
    public static <T> void add(T n, List<? super T> l) {
        System.out.println(n.getClass()); // 직접 T의 타입을 확인
        // C
        l.add(n); // 저장 시 업 캐스팅 가능 예:Number n = 3;
        // U
        //l.set(0, n);
        // D
        //l.remove(0);
        // R
        //Number x = l.get(0); // 컴파일 오류

        //Object o = l.get(0);
        //Number m = (Number)o;
        //System.out.println(m.getClass());
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
        System.out.println(sumNum(l3));
        // 런타임 오류
        //List<String> l4 = Arrays.asList("abc");
        //System.out.println(sum(l4));
        // 컴파일 오류
        //add("abc", l3);
    }
}
