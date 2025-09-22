public class Quiz {
    public static void main(String[] args) {
        //BinOperator<String> op = (a,b) -> a - b; // error
        BinOperator<String> op = (a,b) -> a + b; // OK
        op.apply("abc", "def");
    }
}

interface BinOperator<T> {
    T apply(T a, T b);
}
