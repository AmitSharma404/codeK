package advancejava;
import java.awt.*;
import java.awt.event.*;
public class button {
    public static void main(String[] args) {
        Frame frame = new Frame("Basic Button");
        Label label = new Label("My Button");
        Button button = new Button("Click Me!😂");
        frame.add(button);
        frame.setSize(400,500);
        frame.setVisible(true);
        frame.setLayout(null);
        button.setBounds(10,100,10,100);
        label.setAlignment(Label.CENTER);
        frame.add(label);
        button.setSize(200,100);
        frame.addWindowFocusListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

    }
}
