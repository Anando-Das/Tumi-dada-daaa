package pawnadena;

import pawnadena.Customer;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginFrame extends JFrame {
    private JTextField userField;
    private JPasswordField passField;
    private JButton loginBtn,exitBtn;

    public LoginFrame() {
        setTitle("Login");
        setSize(390, 250);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);
        getContentPane().setBackground(new Color(0xDDEAF6));

        JLabel userLabel = new JLabel("Username:");
        userLabel.setBounds(50, 50, 100, 25);
        userLabel.setForeground(new Color(0x1A237E));
        add(userLabel);

        userField = new JTextField();
        userField.setBounds(150, 50, 120, 25);
        add(userField);

        JLabel passLabel = new JLabel("Password:");
        passLabel.setBounds(50, 90, 100, 25);
        passLabel.setForeground(new Color(0x1A237E));
        add(passLabel);

        passField = new JPasswordField();
        passField.setBounds(150, 90, 120, 25);
        add(passField);

        loginBtn = new JButton("Login");
        loginBtn.setBounds(70, 140, 100, 30);
        loginBtn.setBackground(new Color(0x1976D2)); 
        loginBtn.setForeground(Color.WHITE);
        loginBtn.setFocusPainted(false);
        add(loginBtn);
        
        exitBtn = new JButton("Exit");
        exitBtn.setBounds(190, 140, 100, 30);
        exitBtn.setBackground(new Color(0x1976D2)); 
        exitBtn.setForeground(Color.WHITE);
        exitBtn.setFocusPainted(false);
        add(exitBtn);

        loginBtn.addActionListener(e -> {
            String user = userField.getText();
            String pass = new String(passField.getPassword());

            if (user.equals("admin") && pass.equals("1234")) {
                dispose();
                new DashboardFrame();
            } else {
                JOptionPane.showMessageDialog(this, "Invalid credentials");
            }
        });
        exitBtn.addActionListener(e->{

            System.exit(0);

        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new LoginFrame();
    }
}