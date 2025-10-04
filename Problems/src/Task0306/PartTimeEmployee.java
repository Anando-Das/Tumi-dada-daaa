package Task0306;

public class PartTimeEmployee extends Employee implements TaxTable{


     PartTimeEmployee(String name,double salary) {

        super(name, salary);

    }


    
    
    
    public void displayInfo() {

        System.out.println("Part-time emp salary name: "+name);
        System.out.println("Salary: " + salary);

    }

    public double calculateTax() {

        return salary*0.05;

    }

    
}
