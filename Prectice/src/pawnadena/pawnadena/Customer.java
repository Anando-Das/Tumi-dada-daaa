package pawnadena;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Collections;

public class Customer {
    
    
    public static void addCustomer(String name, String mobile, String notes) {
        
        String data = name + "," + mobile+","+notes+System.lineSeparator();

        Path path = Paths.get("N:/javaProjects/Prectice/src/pawnadena/person");

        try {
            
            Files.write(path, Collections.singletonList(data), StandardOpenOption.CREATE, StandardOpenOption.APPEND);

            System.out.println("Customer added successfully.");


        } catch (Exception e) {
            e.printStackTrace();
        }

        

    }
    



}
