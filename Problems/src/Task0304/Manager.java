package Task0304;

public class Manager extends Employee{
    
    Manager(String name, String jobTitle) {

        super(name, jobTitle);

    }

    void displayInfo() {

        System.out.println("Name : "+name);

        System.out.println("Depertment : "+jobTitle);

    }

}
