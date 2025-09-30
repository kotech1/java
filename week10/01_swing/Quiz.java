import javax.swing.*;        
import java.awt.*;
import java.awt.event.*;

public class Quiz implements ActionListener {
    JFrame frame;
    JButton up, down;
    JLabel label;

    Quiz() {
        frame = new JFrame("Button Example");
        
        frame.setSize(200,100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        // frame 초기화
        // ...
        up = new JButton("Up");

        JLabel label = new JLabel("Hello World");
        frame.add(up);
        frame.add(label);
        up.addActionListener(this);
 
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == up) label.setText("Up");
    }
 
    public static void main(String[] args) {
        SwingUtilities.invokeLater(Quiz::new);
    }
}
