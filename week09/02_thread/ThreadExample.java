
public class ThreadExample {
    public static void main(String[] args) {
        Runnable r = () -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Child: " + i);
                try {
                    Thread.sleep(500); // 0.5초 대기
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        System.out.println(Thread.currentThread().getName());  // main
        Thread t = new Thread(r, "Child #1");
        System.out.println(t.getName()); // Child #1
        t.start();

        for (int i = 1; i <= 5; i++) {
            System.out.println("Main: " + i);
        }
        t.interrupt();
        try {
            t.join();
        } catch (Exception e) { // 수정필요
            e.printStackTrace();
        }
        // 다음 할일 
    }
}

