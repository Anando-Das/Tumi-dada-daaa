package pawnadena;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CustomerHistryBackend {

    public static List<String[]> getCustomerHistory(String mobileNumber) {
        
        Path path = Paths.get("N:/javaProjects/Prectice/src/pawnadena/transaction");
        
        List<String[]> history = new ArrayList<>();
        
        
        try {

            BufferedReader reader =new BufferedReader(new FileReader(path.toFile()));
            
            String line;
            

            while ((line = reader.readLine()) != null) {
                
                String[] parts = line.split("\\s*,\\s*", 6);

                if (parts.length >= 5) {

                    String customerInfo = parts[0].trim(); 
                    String amount = parts[1].trim();
                    String paidNow = parts[2].trim();
                    String date = parts[3].trim();
                    String notes = parts[5 >= parts.length ? 4 : 5].trim();


                    int lastSpaceIndex = customerInfo.lastIndexOf(" ");
                    String name, mobile;

                    if (lastSpaceIndex != -1) {
                        name = customerInfo.substring(0, lastSpaceIndex).trim();
                        mobile = customerInfo.substring(lastSpaceIndex + 1).trim();
                    } else {
                        name = customerInfo;
                        mobile = "";
                    }


                    if (mobile.equals(mobileNumber)) {
                        
                        double due = 0;

                        try {
                            due = Double.parseDouble(amount) - Double.parseDouble(paidNow);
                        } catch (NumberFormatException e) {
                            due = 0;
                        }
                            
                        history.add(new String[]{date, name, mobile, paidNow, String.valueOf(due), notes});
                        

                    }


                }

            }

            reader.close();

        } catch (IOException  e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
        
        
        return history;


        

    }
    public static void updateDue(String mobileNumber, String date, String newDue) {
        Path path = Paths.get("N:/javaProjects/Prectice/src/pawnadena/transaction");
        List<String> lines = new ArrayList<>();

        try {
        BufferedReader reader = new BufferedReader(new FileReader(path.toFile()));
        String line;
        while ((line = reader.readLine()) != null) {
            String[] parts = line.split("\\s*,\\s*", 6);
            if (parts.length >= 5) {
                String customerInfo = parts[0].trim();
                int lastSpaceIndex = customerInfo.lastIndexOf(" ");
                String mobile = lastSpaceIndex != -1 ? customerInfo.substring(lastSpaceIndex + 1).trim() : "";
                String transactionDate = parts[3].trim();

                if (mobile.equals(mobileNumber) && transactionDate.equals(date)) {
                    // Update amount - paidNow = due
                    try {
                        double paidNow = Double.parseDouble(parts[2].trim());
                        double newDueDouble = Double.parseDouble(newDue);
                        double newAmount = paidNow + newDueDouble;
                        parts[1] = String.valueOf(newAmount); // Update total amount
                    } catch (NumberFormatException ignored) {}
                    // Reconstruct line
                    StringBuilder sb = new StringBuilder();
                    for (int i = 0; i < parts.length; i++) {
                        sb.append(parts[i].trim());
                        if (i < parts.length - 1) sb.append(",");
                    }
                    line = sb.toString();
                }
            }
            lines.add(line);
        }
        reader.close();

        // Write all lines back
        BufferedWriter writer = new BufferedWriter(new FileWriter(path.toFile()));
        for (String l : lines) {
            writer.write(l);
            writer.newLine();
        }
        writer.close();

    } catch (IOException e) {
        System.out.println("Error updating file: " + e.getMessage());
    }

    
    }


    

}
