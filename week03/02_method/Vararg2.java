// Vararg2.java
public class Vararg2 {

    public static void parseArguments(Object... args) {
        for (Object arg : args) {
            if (arg instanceof Integer) {
                System.out.println("정수형: " + arg);
            } else if (arg instanceof Double) {
                System.out.println("실수형: " + arg);
            } else if (arg instanceof String) {
                System.out.println("문자열: \"" + arg + "\"");
            } else if (arg instanceof Boolean) {
                System.out.println("불리언: " + arg);
            } else if (arg == null) {
                System.out.println("널(null) 값");
            } else {
                System.out.println("기타 타입: " + arg.getClass().getName());
            }
        }
    }

    public static void main(String[] args) {
        parseArguments(42, 3.14, "Hello", true, null, new java.util.Date());
    }
}
