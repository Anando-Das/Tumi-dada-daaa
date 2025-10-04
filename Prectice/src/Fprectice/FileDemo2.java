package Fprectice;

import java.util.Formatter;
import java.util.Scanner;

public class FileDemo2 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String name,id;
        
        try {
            
            Formatter formatter = new Formatter("N:/javaProjects/Prectice/src/Fprectice/person/teacher.text"); 

            System.out.println("Enter how many student: ");

            int num = input.nextInt();

            for(int i = 1; i<=num; i++) {

                System.out.println("Enter student name and id: ");

                name = input.next();

                id = input.next();

                formatter.format("%s %s\r", name, id);

                

            }

            formatter.close();

        } catch (Exception e) {
            System.out.println(e);
        }


    }

}
