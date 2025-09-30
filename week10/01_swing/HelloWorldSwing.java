/*
 *
 * HelloWorldSwing.java
 * 스윙 GUI 기본 프로그램
 *
 */
import javax.swing.*;       
//import java.awt.*;

public class HelloWorldSwing {
    /*
     * GUI를 생성하고 표시하는 메소드
     * Event Dispaching thread에서 호출
     */
    private static void createAndShowGUI() {
        // 창의 제목과 함께 윈도우 생성
        JFrame frame = new JFrame("HelloWorldSwing");
        
        // 창 크기 결정
        frame.setSize(275,100);
        //frame.setSize(400,300);
        // 기본 닫기 버튼 동작 설정
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setLayout(new FlowLayout());
 
        // 라벨 생성 및 추가
        JLabel label = new JLabel("Hello, world.");
        frame.add(label);
        
/*
        frame.add(new JButton("West"), BorderLayout.WEST);
        frame.add(new JButton("East"), BorderLayout.EAST);
        frame.add(new JButton("North"), BorderLayout.NORTH);
        frame.add(new JButton("South"), BorderLayout.SOUTH);
        frame.add(new JButton("Center")); // 기본은 CENTER
*/
 
        // 창 표시
        frame.setVisible(true);

        // 스레드 명 확인: AWT-EventQueue-0
        System.out.println(Thread.currentThread().getName()); 
    }
 
    public static void main(String[] args) {
        // 이벤트 디스패치 스레드 생성 및 GUI 표시
        /* 
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
        */
        SwingUtilities.invokeLater( () -> createAndShowGUI() );
        System.out.println("main 스레드 종료");
    }
}
