package pawnadena;

import pawnadena.Transaction;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class AddTransactionFrame extends JFrame {
    private JComboBox<String> customerDropdown;
    private JTextField amountField, paidNowField, dateField;
    private JTextArea notesArea;
    private JButton backButton, saveButton, cancelButton;

    public AddTransactionFrame() {
        setTitle("Add Transaction");
        setSize(450, 400);
        setLayout(null);
        setLocationRelativeTo(null);
        getContentPane().setBackground(new Color(0xE8F5E9));

        JLabel selectLabel = new JLabel("Select Customer:");
        selectLabel.setBounds(30, 30, 120, 25);
        add(selectLabel);

        customerDropdown = new JComboBox<>(new String[] {"Select", "John Doe", "Jane Smith", "Alice"});
        customerDropdown.setBounds(160, 30, 230, 25);
        add(customerDropdown);

        Transaction.getCustomersNames(customerDropdown);


        JLabel amountLabel = new JLabel("Purchase Amount:");
        amountLabel.setBounds(30, 70, 120, 25);
        add(amountLabel);

        amountField = new JTextField();
        amountField.setBounds(160, 70, 230, 25);
        add(amountField);

        JLabel paidLabel = new JLabel("Paid Now:");
        paidLabel.setBounds(30, 110, 120, 25);
        add(paidLabel);

        paidNowField = new JTextField();
        paidNowField.setBounds(160, 110, 230, 25);
        add(paidNowField);

        JLabel dateLabel = new JLabel("Date:");
        dateLabel.setBounds(30, 150, 120, 25);
        add(dateLabel);

        dateField = new JTextField();
        dateField.setBounds(160, 150, 230, 25);
        add(dateField);

        JLabel notesLabel = new JLabel("Notes:");
        notesLabel.setBounds(30, 190, 120, 25);
        add(notesLabel);

        notesArea = new JTextArea();
        JScrollPane scroll = new JScrollPane(notesArea);
        scroll.setBounds(160, 190, 230, 60);
        add(scroll);

        saveButton = new JButton("Save Transaction");
        saveButton.setBounds(60, 270, 150, 30);
        add(saveButton);

        cancelButton = new JButton("Cancel");
        cancelButton.setBounds(230, 270, 100, 30);
        add(cancelButton);

        saveButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String customer = customerDropdown.getSelectedItem().toString();
                String amount = amountField.getText().trim();
                String paidNow = paidNowField.getText().trim();
                String date = dateField.getText().trim();
                String notes = notesArea.getText().trim();

                if (!amount.isEmpty() && !paidNow.isEmpty() && !date.isEmpty()) {

                    Transaction.saveTrunsaction(customer, amount, paidNow, date, notes);

                    JOptionPane.showMessageDialog(null, "Transaction successfully added!");

                    customerDropdown.setSelectedIndex(0);
                    amountField.setText("");
                    paidNowField.setText("");
                    dateField.setText("");
                    notesArea.setText("");


                } else {
                    JOptionPane.showMessageDialog(null, "Please fill the purchase amount, paid now, and date fields.");
                }
            }
        });

        cancelButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                customerDropdown.setSelectedIndex(0); 
                amountField.setText("");
                paidNowField.setText("");
                dateField.setText("");
                notesArea.setText("");
            }
        });

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        setVisible(true);
    }

    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new AddTransactionFrame();
            }
        });
    }
}
