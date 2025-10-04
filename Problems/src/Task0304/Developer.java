package Task0304;

public class Developer extends Employee{
    
    Developer(String name, String jobTitle) {

        super(name, jobTitle);

    }

    void displayInfo() {

        System.out.println("Name : "+name);

        System.out.println("Pogramming language : "+jobTitle);

    }

}
