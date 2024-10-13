package bank_management_system;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener{
    JButton signin, signup, clear;
    JTextField cardTextField;
    JPasswordField pinTextField;
    Login() {
        setTitle("AUTOMATED TELLER MACHINE");

        setLayout(null);

        ImageIcon il = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image i2 = il.getImage().getScaledInstance(100, 100, Image.SCALE_AREA_AVERAGING);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel Label = new JLabel(i3); 
        Label.setBounds(70, 10, 100, 100);
        add(Label);

        JLabel text = new JLabel("Welcom to ATM");
        text.setFont(new Font("Osward", Font.BOLD, 38));
        text.setBounds(200, 40, 400, 40);
        add(text);

        JLabel cardno = new JLabel("Card No:");
        cardno.setFont(new Font("Arial", Font.BOLD, 28));
        cardno.setBounds(120, 150, 150, 30);
        add(cardno);

        cardTextField = new JTextField();
        cardTextField.setBounds(300, 150, 250, 30);
        add(cardTextField);

        JLabel pin = new JLabel("PIN:");
        pin.setFont(new Font("Arial", Font.BOLD, 28));
        pin.setBounds(120, 200, 400, 30);
        add(pin);
        getContentPane().setBackground(Color.WHITE);

        pinTextField = new JPasswordField();
        pinTextField.setBounds(300, 200, 250, 30);
        add(pinTextField);

        signin = new JButton("SIGN IN");
        signin.setBounds(300, 250, 100, 30);
        signin.setBackground(Color.BLACK);
        signin.setForeground(Color.WHITE);
        signin.addActionListener(this);
        add(signin);

        clear = new JButton("CLEAR");
        clear.setBounds(450, 250, 100, 30);
        clear.setBackground(Color.BLACK);
        clear.setForeground(Color.WHITE);
        clear.addActionListener(this);
        add(clear);

        signup = new JButton("SIGN UP");
        signup.setBounds(300, 300, 250, 30);
        signup.setBackground(Color.BLACK);
        signup.setForeground(Color.WHITE);
        signup.addActionListener(this);
        add(signup);

        setSize(800, 400);
        setVisible(true);
        setLocation(350, 200);
    }

    public void  actionPerformed(ActionEvent ae) {
        if(ae.getSource() == clear) {
            cardTextField.setText("");
            pinTextField.setText("");
        } else if(ae.getSource() == signin) {

        } else if(ae.getSource() == signup) {

        }
    }
    public static void main(String[] agrs) {
        new Login();
    }
}

