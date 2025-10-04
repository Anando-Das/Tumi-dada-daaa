package pawnadena;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Collections;

import javax.swing.JComboBox;

public class Transaction {

    public static void getCustomersNames(JComboBox<String> dropdown) {

        //  File file = new File("N:/javaProjects/Prectice/src/pawnadena/person");

        Path file = Paths.get("N:/javaProjects/Prectice/src/pawnadena/person");

        if (!Files.exists(file)) {
            return;
        }

        try {
            BufferedReader reader = new BufferedReader(new FileReader(file.toFile()));

            String line;

            while ((line = reader.readLine()) != null) {
                
                String[] parts = line.split(",");

                if (parts.length>0 && parts.length>1) {
                    
                    dropdown.addItem(parts[0].trim() +"  "+ parts[1].trim());

                }

            }



        } catch (Exception e) {
            
           e.printStackTrace();

        }

    }
    
    public static void saveTrunsaction(String Customer, String amount, String paidNow, String date, String notes){

        String data = Customer+" , "+amount+" , "+paidNow+ " , "+date+" , "+" , "+notes+System.lineSeparator();

        Path path = Paths.get("N:/javaProjects/Prectice/src/pawnadena/transaction");

        try {
            
            Files.write(path, Collections.singletonList(data), StandardOpenOption.CREATE, StandardOpenOption.APPEND); 

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    

    

}
