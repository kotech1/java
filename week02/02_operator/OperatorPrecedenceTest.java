public class OperatorTest {
    public static void main(String[] args) {
        int a = 2, b = 3, c = 1;

        int result = a + b << 2 > 10 ? b++ + c * 2 : --a + 4;

        System.out.println("result = " + result);
        System.out.println("a = " + a + ", b = " + b + ", c = " + c);
    }
}
