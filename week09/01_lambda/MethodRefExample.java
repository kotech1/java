// MethodRefExample.java
import java.util.function.IntBinaryOperator;

public class MethodRefExample {
    public static void main(String[] args) {
        // 일반 람다 메소드
        //IntBinaryOperator op = (a,b) -> Math.max(a,b);
        // 메소드 참조
        IntBinaryOperator op = Math::max;
        int a = op.applyAsInt(5, 3); // 5
        System.out.println(a);
    }
}


