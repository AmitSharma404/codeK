package practice

import java.awt.*;
import java.awt.event.WindowAdapter;

public class hi {

    public static void main(String[] args) {
        Frame f1 = new Frame("Applet");
        Button b1 = new Button("Click Me!");

        frame.add(b1);
        frame.setSize(500,500);
        frame.setVisible(true);
        frame.setLayout()

        frame.addActionListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        })
    }
}