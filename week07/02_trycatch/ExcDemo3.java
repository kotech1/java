// 커스텀 RuntimeException (Unchecked)
class MyException extends RuntimeException {
    public MyException(String message) {
        super(message);
    }
}

public class ExcDemo3 {
    public static void doSomething(String input) {
        if (input == null) {
            throw new MyException("입력값이 null입니다.");
        }
    }

    public static void main(String[] args) {
        doSomething(null);  // 예외 발생
    }
}


