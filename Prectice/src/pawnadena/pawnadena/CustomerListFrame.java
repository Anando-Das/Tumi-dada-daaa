package pawnadena;

import java.awt.*;
import java.util.List;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class CustomerListFrame extends JFrame {
    public CustomerListFrame() {
        setTitle("Customer List");
        setSize(400, 350); 
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        Color purple = new Color(0xD8BFD8);

        
        String[] columns = {"Name", "Mobile", "Notes"};

        List<String[]> customers = CustomerListBackend.getAllCustomers();

        
        DefaultTableModel model = new DefaultTableModel(columns, 0);

        for (String[] c : customers) {
            model.addRow(c); 
        }

        JTable table = new JTable(model);

        table.setBackground(purple);
        table.setForeground(Color.BLACK); 
        table.getTableHeader().setBackground(new Color(0xBA55D3)); 
        table.getTableHeader().setForeground(Color.WHITE);

        JScrollPane scrollPane = new JScrollPane(table);

        
        JButton deleteButton = new JButton("Delete Selected");
        deleteButton.setBackground(new Color(0xFF6347)); 
        deleteButton.setForeground(Color.WHITE);

        
        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedRow = table.getSelectedRow();
                if (selectedRow != -1) { 
                    int confirm = JOptionPane.showConfirmDialog(
                        null, 
                        "Are you sure you want to delete this customer?", 
                        "Confirm Delete", 
                        JOptionPane.YES_NO_OPTION
                    );
                    if (confirm == JOptionPane.YES_OPTION) {
                        model.removeRow(selectedRow);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Please select a row to delete.");
                }
            }
        });

        
        setLayout(new BorderLayout());
        add(scrollPane, BorderLayout.CENTER);
        add(deleteButton, BorderLayout.SOUTH);

        setVisible(true);
    }
}
