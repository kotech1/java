// GenericsExample1.java
public class GenericsExample1 {
    public static void main(String[] args) {
        MyBinaryOperator<Integer> iSum = (a, b) -> a + b;
        MyBinaryOperator<Long> lSum = (a, b) -> a + b;
        MyBinaryOperator<String> concat = (a, b) -> a + b;

        System.out.println(iSum.apply(3, 5));    // 8
        System.out.println(lSum.apply(3L, 5L));    // 8
        System.out.println(concat.apply("A", "B")); // AB
    }
}

interface MyBinaryOperator<T> {
    T apply(T t1, T t2);
}
