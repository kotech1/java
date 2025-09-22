import java.util.function.LongBinaryOperator;
/*
@FunctionalInterface
public interface LongBinaryOperator {
    long applyAsLong(long left, long right);
}
*/

public class LongBinaryOpExample {
    public static void main(String[] args) {
        // overflow시 Arithmatic Exception 발생
        LongBinaryOperator op = (a,b) -> Math.multiplyExact(a,b);
        System.out.println(op.applyAsLong(3L, 7L)); // 21
    }
}

