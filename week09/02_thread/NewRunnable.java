/*
@FunctionalInterface
public interface Runnable {
    void run();
}
*/

public class NewRunnable {
    public static void main(String[] args) {
        Runnable r = () -> { // 람다 메소드
            for (int i = 1; i <= 50; i++) {
                System.out.println("Child: " + i);
            }
        };
        /*
        Runnable r = new Runnable() { // 익명 클래스
            public void run() {
                for (int i = 1; i <= 50; i++) {
                    System.out.println("Runnable: " + i);
                }
            }
        };
        */
        Thread t = new Thread(r);
        t.start();

        for (int i = 1; i <= 50; i++) {
            System.out.println("Main: " + i);
        }
    }
}
