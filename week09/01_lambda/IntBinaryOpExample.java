//
import java.util.function.IntBinaryOperator;

public class IntBinaryOpExample {
    public static void main(String[] args) {
        // overflow시 Arithmatic Exception 발생
        IntBinaryOperator op = (a,b) -> Math.multiplyExact(a,b);
        System.out.println(op.applyAsInt(3, 7)); // 21
    }
}

/*
@FunctionalInterface
public interface IntBinaryOperator {
    int applyAsInt(int left, int right);
}
*/


