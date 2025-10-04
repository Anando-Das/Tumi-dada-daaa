package pawnadena;

import java.awt.*;
import java.util.List;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class CustomerHistory extends JFrame {

    public CustomerHistory() {
        setTitle("Transaction Search by Number");
        setSize(600, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        getContentPane().setBackground(new Color(0xFFCCCC));

        // 🔹 Search panel
        JPanel topPanel = new JPanel();
        JLabel label = new JLabel("Enter Mobile Number: ");
        JTextField searchField = new JTextField(15);
        JButton searchButton = new JButton("Search");
        topPanel.add(label);
        topPanel.add(searchField);
        topPanel.add(searchButton);
        topPanel.setOpaque(false);

        // 🔹 Table
        String[] columns = {"Date", "Customer Name", "Number", "Paid", "Due", "Notes"};
        DefaultTableModel model = new DefaultTableModel(columns, 0);
        JTable table = new JTable(model);
        JScrollPane scrollPane = new JScrollPane(table);

        // 🔹 Edit Due button
        JButton editDueButton = new JButton("Edit Due");

        JPanel bottomPanel = new JPanel();
        bottomPanel.add(editDueButton);

        setLayout(new BorderLayout());
        add(topPanel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);
        add(bottomPanel, BorderLayout.SOUTH);

        // 🔹 Search button action
        searchButton.addActionListener(e -> {
            String searchNumber = searchField.getText().trim();
            model.setRowCount(0);

            if (searchNumber.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please enter a mobile number!");
                return;
            }

            List<String[]> results = CustomerHistryBackend.getCustomerHistory(searchNumber);

            if (results.isEmpty()) {
                JOptionPane.showMessageDialog(null, "No transactions found for this number.");
            } else {
                for (String[] row : results) {
                    model.addRow(row);
                }
            }
        });

        // 🔹 Edit Due button action
        editDueButton.addActionListener(e -> {
            int selectedRow = table.getSelectedRow();
            if (selectedRow == -1) {
                JOptionPane.showMessageDialog(null, "Please select a row to edit due!");
                return;
            }

            String date = model.getValueAt(selectedRow, 0).toString();

            String mobile = model.getValueAt(selectedRow, 2).toString();
            
            String currentDue = model.getValueAt(selectedRow, 4).toString(); // Due column

            String newDue = JOptionPane.showInputDialog(null, "Enter new due amount:", currentDue);
            if (newDue != null && !newDue.trim().isEmpty()) {
                model.setValueAt(newDue, selectedRow, 4); // Update table

                // 🔹 Backend update call (NEW)
                CustomerHistryBackend.updateDue(mobile, date , newDue);

                JOptionPane.showMessageDialog(null, "Due updated successfully!");
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new CustomerHistory();
    }
}
