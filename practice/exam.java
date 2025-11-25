package practice;
import java.awt.*;

public class exam extends Frame {


    public login() {
        Frame f = new Frame();
        Button b = new Button("Click Me !");
        f.add(f);
        f.setTitle("My Login form");
        b.setBounds(MAXIMIZED_BOTH, ABORT, WIDTH, HEIGHT);
        b.addActionListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        }
        );
    }




}
