package pawnadena;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CustomerListBackend {
        

    public static List<String[]> getAllCustomers() {

        Path path = Paths.get("N:/javaProjects/Prectice/src/pawnadena/person");

        List<String[]> customers = new ArrayList<>();

        try {
            BufferedReader reader = new BufferedReader(new FileReader(path.toFile()));
            String line;

            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",", 3); 
                if (parts.length >= 2) {
                    String name = parts[0].trim();
                    String mobile = parts[1].trim();
                    String notes = parts.length == 3 ? parts[2].trim() : "";
                    customers.add(new String[]{name, mobile, notes});
                }
            }

             reader.close();

        } catch (Exception e) {
            System.out.println("Error reading customer file: " + e.getMessage());
        }


        return customers;

    }

    
}

   



    

