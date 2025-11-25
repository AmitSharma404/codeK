package practice;
import java.awt.FlowLayout;

import javax.swing.*;

public class swing {
    public static void main(String[] args) {
        
    
    
    JFrame frame = new JFrame("Swing");

    
    frame.setVisible(true);
    frame.setSize(500,500);
    frame.add(new JButton('1'));
    frame.add(new JButton('2'));
    frame.add(new JButton('3'));
    frame.add(new JButton('4'));
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLayout(new FlowLayout(FlowLayout.TRAILING));
    }
}
