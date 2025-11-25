import java.awt.*;
import javax.swing.*;

public class graph extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.RED);
        g.drawLine(50, 50, 150, 50);
        g.drawRect(50, 70, 100, 50);
        g.fillOval(90, 200, 200, 90);
        g.setFont(new Font("Arial", Font.BOLD, 44));
        g.drawString("Hello graphics", 50, 220);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Graphics example");
        
        frame.setSize(400, 400);
        graph panel = new graph();
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
 
