package Fprectice;

import java.io.File;
import java.util.Scanner;

public class FileDemo3 {
    
    public static void main(String[] args) {
        
        try {
            
            File file = new File("N:/javaProjects/Prectice/src/Fprectice/person/teacher.text");

            Scanner scan = new Scanner(file);

            while (scan.hasNext()) {
                
                String name = scan.next();

                String id = scan.next();

                System.out.println("Name: "+name+"\nid: "+id);

            }

        } catch (Exception e) {
            System.out.println(e);
        }

    }

}
