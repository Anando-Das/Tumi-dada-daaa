package pawnadena;
import java.awt.Color;

import javax.swing.*;
import javax.swing.text.JTextComponent;

public class AddCustomerFrame extends JFrame {
    private JTextField nameField, mobileField;
    private JTextArea notesArea;

    public AddCustomerFrame() {
        setTitle("Add Customer");
        setSize(400, 300);
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        getContentPane().setBackground(new Color(0xADD8E6));

        JLabel nameLabel = new JLabel("Name:");
        nameLabel.setBounds(30, 30, 80, 25);
        add(nameLabel);

        nameField = new JTextField();
        nameField.setBounds(120, 30, 200, 25);
        add(nameField);

        JLabel mobileLabel = new JLabel("Mobile:");
        mobileLabel.setBounds(30, 70, 80, 25);
        add(mobileLabel);

        mobileField = new JTextField();
        mobileField.setBounds(120, 70, 200, 25);
        add(mobileField);

        JLabel notesLabel = new JLabel("Notes:");
        notesLabel.setBounds(30, 110, 80, 25);
        add(notesLabel);

        notesArea = new JTextArea();
        JScrollPane scroll = new JScrollPane(notesArea);
        scroll.setBounds(120, 110, 200, 80);
        add(scroll);

        
        JButton addButton = new JButton("Add Customer");
        JButton clearButton = new JButton("Clear");

        
        addButton.setBounds(100, 210, 130, 30);
        clearButton.setBounds(240, 210, 80, 30);

        add(addButton);
        add(clearButton);

        addButton.addActionListener(e->{
           String name = nameField.getText().trim();
           String mobile = mobileField.getText().trim();
           
           String notes = notesArea.getText().trim();
           if(!name.isEmpty() && !mobile.isEmpty())
           {
                Customer.addCustomer(name, mobile, notes);
                JOptionPane.showMessageDialog(null,"Successfully Added");

                nameField.setText(" ");

                mobileField.setText(" ");

                notesArea.setText(" ");

           }
           else
           {
                JOptionPane.showMessageDialog(null,"Please fill in Name and Mobile!");
           }
        });
        clearButton.addActionListener(e -> {
            nameField.setText("");
            mobileField.setText("");
            notesArea.setText("");
        });

        setVisible(true);
    }
}
