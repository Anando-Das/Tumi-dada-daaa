package Task0306;

public class test {
    public static void main(String[] args) {
        
        FullTimeEmployee fu = new FullTimeEmployee("kkr", 2000);
        fu.displayInfo();
        System.out.println("tax: "+fu.calculateTax());
        

        PartTimeEmployee pr = new PartTimeEmployee("kkr", 200);
        pr.displayInfo();
        System.out.println("tax: "+pr.calculateTax());
        
    }
}
