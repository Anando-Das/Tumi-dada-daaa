package Task0306;

public abstract class Employee {

    String name;
    double salary;

    Employee(String name,double salary) {

        this.name = name;

        this.salary = salary;

    }

    abstract  void displayInfo();

}
