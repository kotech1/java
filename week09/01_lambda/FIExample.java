public class FIExample {
    public static void main(String[] args) {
        //MyFunc f = new MyFunc(); // OK
        Function f = new MyFunc(); // 업 캐스팅
        f.run(); // Hello
    }
}

@FunctionalInterface // 권장: 추상 메소드 1개 확인
interface Function {
    void run(); // 추상 메소드 1개
}

class MyFunc implements Function {
    public void run() { // 항상 public
        System.out.println("Hello");
    }
}
