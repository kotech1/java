interface Function2 {
    void run(); // 추상 메소드 1개
}

public class LambdaExample {
    public static void main(String[] args) {
        Function2 f = () -> {
            System.out.println("Hello");
        };
        f.run(); // Hello
    }
}

