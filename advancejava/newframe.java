package advancejava;
import java.awt.*;
import java.awt.event.WindowAdapter;

public class newframe {
    public static void main(String[] args) {
        Frame F = new Frame();
        F.setVisible(true);
        F.setTitle("Myframe");

        F.addWindowFocusListener(new WindowAdapter() {
            
        })
    }
}
