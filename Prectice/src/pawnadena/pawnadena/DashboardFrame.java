package pawnadena;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DashboardFrame extends JFrame {
    private Container c;
    
    public DashboardFrame() {
        setTitle("Dashboard");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(2, 2, 10, 10));

        c = this.getContentPane();
        c.setBackground(Color.yellow);
        
        JButton btn1 = new JButton("Add Customer");
        JButton btn2 = new JButton("Add Transaction");
        JButton btn3 = new JButton("Customer List");
        JButton btn4 = new JButton("Customer History");

        btn1.setBackground(new Color(0x1565C0)); 
        btn1.setForeground(Color.WHITE);        

        btn2.setBackground(new Color(0x00897B)); 
        btn2.setForeground(Color.WHITE);        

        btn3.setBackground(new Color(0x512DA8)); 
        btn3.setForeground(Color.WHITE);         

        btn4.setBackground(new Color(0xF44336)); 
        btn4.setForeground(Color.WHITE);         

        Font buttonFont = new Font("Arial", Font.BOLD, 16);
        btn1.setFont(buttonFont);
        btn2.setFont(buttonFont);
        btn3.setFont(buttonFont);
        btn4.setFont(buttonFont);

        
        btn1.addActionListener(e -> new AddCustomerFrame());
        btn2.addActionListener(e -> new AddTransactionFrame());
        btn3.addActionListener(e -> new CustomerListFrame());
        btn4.addActionListener(e -> new CustomerHistory());

        add(btn1);
        add(btn2);
        add(btn3);
        add(btn4);

        setVisible(true);
    }
}
