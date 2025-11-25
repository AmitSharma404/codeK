package advancejava;
import java.awt.*;
import java.awt.event.*;

public class Login extends Swing {
    // constructor
    Login() {

        Color bg = new Color(0,128,128);
        setBackground(bg);
        setForeground(Color.WHITE);
        // GUI CODE
        Label l1 = new Label("Login Form");
        add(l1);
        l1.setBounds(100, 100, 200,100);
        Label l2 = new Label("First Name");
        add(l2);
        TextField t1 = new TextField(20);
        add(t1);
        t1.setForeground(Color.black);
        Label l3 = new Label("Last Name");
        add(l3);
        TextField t2 = new TextField(20);
        add(t2);
        Label l4  = new Label("Address");
        add(l4);
        TextArea t3 = new TextArea(10,30);
        add(t3);
        Checkbox c1 = new Checkbox("C++");
        add(c1);
        Checkbox c2 = new Checkbox("Python");
        add(c2);
        Checkbox c3 = new Checkbox("JavaScript");
        add(c3);
        CheckboxGroup cbg = new CheckboxGroup();
        Checkbox c4 = new Checkbox("Male",cbg,false);
        add(c4);
        Checkbox c5 = new Checkbox("Female",cbg,false);
        add(c5);


        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });


        setVisible(true);
        setSize(600,700);
        setTitle("Login Form");
        setLayout(new FlowLayout());
        setResizable(false);
    }

    public static void main(String[] args) {
        Login L = new Login();
    }
}
