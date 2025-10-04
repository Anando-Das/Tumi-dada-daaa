package Task0306;

public class FullTimeEmployee extends Employee implements TaxTable{

    FullTimeEmployee(String name,double salary) {

        super(name, salary);

    }


    
    
    
    public void displayInfo() {

        System.out.println("Full-time emp salary name: "+name);
        System.out.println("Salary: " + salary);

    }

    public double calculateTax() {

        return salary * 0.15;

    }

}
