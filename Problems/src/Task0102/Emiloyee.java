package Task0102;

public class Emiloyee {
    
    private String name,id;

    private double salary;

    public void setName(String name) {

        this.name = name;

    }

    public String getName() {

        return name;

    }

    public void setId(String id) {

        this.id = id;

    }

    public void setSalary(double salary) {

        this.salary = salary;

    }


    void displayDetails() {
        System.out.println(name);
        System.out.println(id);
        System.out.println(salary);
    }

    public static void main(String[] args) {
        
        Emiloyee ob = new Emiloyee();

        ob.setName("mm");

        ob.setId("232-141");

        ob.setSalary(12.00);

        ob.displayDetails();

    }



}
