package advancejava;
import java.awt.*;
import java.awt.event.*;
public class Applet{
    public static void main(String[] args) {
    Frame frame = new Frame("Basic Program");
    Label label = new Label("Hello World");
    Button button =  new Button("Click Me!");
    frame.add(button);
    frame.setSize(300,200);
    frame.setVisible(true);
    frame.setLayout(null);
    button.setBounds(10,100,10,100);
    label.setAlignment(Label.CENTER);
    button.setSize(100,200);
    frame.getInputContext();
    frame.add(label);
    frame.setSize(300,300);
    frame.setVisible(true);
    frame.addWindowFocusListener(new WindowAdapter() {
        @Override
        public void windowClosing(WindowEvent e) {
            System.exit(0);
        }
    });
    } 
}
