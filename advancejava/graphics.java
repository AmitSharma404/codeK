import javax.swing.*;
import java.awt.*;

public class graphics extends JPanel {

    // Drawing shapes on panel
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Draw a red line
        g.setColor(Color.RED);
        g.drawLine(50, 30, 200, 30);

        // Draw a blue rectangle
        g.setColor(Color.BLUE);
        g.drawRect(50, 60, 150, 50);

        // Draw a green filled oval
        g.setColor(Color.GREEN);
        g.fillOval(50, 130, 150, 50);

        // Draw some text
        g.setColor(Color.BLACK);
        g.setFont(new Font("Arial", Font.BOLD, 16));
        g.drawString("Java Graphics Example", 50, 210);
    }

    public static void main(String[] args) {
        // Create frame
        JFrame frame = new JFrame("Drawing Components Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(350, 300);

        // Add the panel to frame before setting visible
        graphics panel = new graphics();
        frame.add(panel);

        // Ensure the panel fills the frame
        panel.setPreferredSize(new Dimension(350, 300));
        frame.pack();

        // Make the frame visible
        frame.setVisible(true);
    }
}
