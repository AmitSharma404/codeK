package advancejava;

import java.awt.Frame;
import java.awt.Label;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class helloworld{
    public static void main(String[] args) {
        Frame frame = new Frame("Basic Program");
        Label label = new Label("Hello World!");

        frame.add(label);
        label.setAlignment(label.CENTER);
        frame.setTitle("Hello There!`");
        frame.setSize(500,500);
        frame.setVisible(true);

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
