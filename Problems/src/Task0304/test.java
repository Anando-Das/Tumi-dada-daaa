package Task0304;

public class test {
    
    public static void main(String[] args) {
        
        Employee ob = new Employee(null, null);

        ob = new Manager("Alice", "hr");
        ob.displayInfo() ;

        ob = new Developer("Bob", "java");
        ob.displayInfo() ;




    }

}
