/*
 * HelloWorldSwing.java requires no other files. 
 */
import javax.swing.*;        

public class HelloWorldSwing {
    /**
     * Create the GUI and show it.  For thread safety,
     * this method should be invoked from the
     * event-dispatching thread.
     */
    private static void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame("HelloWorldSwing");
        
        frame.setSize(275,100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        //Add the ubiquitous "Hello World" label.
        JLabel label = new JLabel("Hello World");
        frame.add(label);
 
        //Display the window.
        //frame.pack();
        frame.setVisible(true);

        // 스레드 명 확인: AWT-EventQueue-0
        System.out.println(Thread.currentThread().getName()); 
    }
 
    public static void main(String[] args) {
        // 이벤트 디스패치 스레드 생성 및 GUI 표시
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
        System.out.println("main 스레드 종료");
    }
}
