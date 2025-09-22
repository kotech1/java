class MyThread2 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++)
            System.out.println("MyThread: " + i);
    }
}

public class ThreadExample2 {
    public static void main(String[] args) {
        MyThread2 t = new MyThread2();
        t.start(); // run() 직접 호출이 아니라 start()로 실행
    }
}

