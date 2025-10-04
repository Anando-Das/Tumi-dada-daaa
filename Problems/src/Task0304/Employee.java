package Task0304;

public class Employee {
    
    String name, jobTitle;

    Employee(String name, String jobTitle) {

        this.name = name;

        this.jobTitle = jobTitle;

    }

    void displayInfo() {

        System.out.println("Name : "+name);

        System.out.println("jobTitle : "+jobTitle);

    }

}
