@FunctionalInterface // 권장: 추상 메소드 1개 확인
interface Function4 {
    void run();
}

public class AnonymousClassExample {
    public static void main(String[] args) {
        Function4 f = new Function4() { // 익명 클래스
            public void run() {
                System.out.println("Hello");
            }
        };
        f.run(); // Hello
    }
}


