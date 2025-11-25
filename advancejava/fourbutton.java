import java.awt.*;
import java.awt.event.*;

public class fourbutton extends Frame implements ActionListener {
    // Constructor to set up the GUI
    public fourbutton() {
        // Set the title of the window
        setTitle("Four Buttons AWT Example");

        // Set the layout manager
        setLayout(new FlowLayout());

        // Create four buttons
        Button button1 = new Button("Button 1");
        Button button2 = new Button("Button 2");
        Button button3 = new Button("Button 3");
        Button button4 = new Button("Button 4");

        // Add action listeners to the buttons
        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);

        // Add buttons to the frame
        add(button1);
        add(button2);
        add(button3);
        add(button4);

        // Set the size of the window
        setSize(600, 400);
        // Set the window to close when the close button is clicked
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });

        // Make the window visible
        setVisible(true);
    }

    // Action performed method to handle button clicks
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        System.out.println(command + " clicked!");
    }

    // Main method to run the program
    public static void main(String[] args) {
        new fourbutton();
    }
}
