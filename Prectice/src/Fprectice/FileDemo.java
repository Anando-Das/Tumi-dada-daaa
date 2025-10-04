package Fprectice;

import java.io.File;

public class FileDemo {
    
    public static void main(String[] args) {
        
        File dir = new File("N://javaProjects//Prectice//src//Fprectice//person");

        dir.mkdir();

        String e = dir.getAbsolutePath();

        System.out.println(e);

        System.out.println(dir.getName());


        File file1 = new File("N://javaProjects//Prectice//src//Fprectice//person//Student");
        File file2 = new File("N://javaProjects//Prectice//src//Fprectice//person//teacher");

        try {

            file1.createNewFile();
            file2.createNewFile();
            
        } catch (Exception ex) {
            System.out.println(ex);


        }

        file1.delete();

        if (file1.exists()) {
            
            System.out.println("File.exist");

        }else{
             System.out.println("File not exist");
        }


    }

}
