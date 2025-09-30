import javax.swing.*;        
import java.awt.*;
import java.awt.event.*;

public class EventExample implements ActionListener {
    JFrame frame;
    JButton up, down;
    JLabel label;

    EventExample() {
        frame = new JFrame("Button Example");
        
        frame.setSize(200,100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
 
        up = new JButton("Up");
        down = new JButton("down");

        label = new JLabel("Hello World");
        frame.add(up);
        frame.add(down);
        frame.add(label);
        up.addActionListener(this);
        down.addActionListener(this);
 
        frame.setVisible(true);
    }

    public void changeLabel(String s) {
        label.setText(s);
        System.out.println(s);
    }

    public void actionPerformed(ActionEvent e) {
        Object c = e.getSource();
        if (c == up)
            changeLabel("Up pressed");
        else if (c == down) {
            changeLabel("Down pressed");
        }
    }
 
    public static void main(String[] args) {
        //SwingUtilities.invokeLater(() -> new EventExample());
        SwingUtilities.invokeLater(EventExample::new);
    }
}
