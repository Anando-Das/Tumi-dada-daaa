package Task0404;

public class BankAccountHierarchy {

    public static void main(String[] args) {
        
        
       

        SavingAccount ob = new SavingAccount("SA001",1000.0, 0.05);
        ob.displayBalance();
        ob.addInterest();
        ob.displayBalance();

        CheackingAccount oc = new CheackingAccount("CA001",500.0, 200.0);
        oc.displayBalance();
        oc.withdraw(700);
        oc.displayBalance();
    }
    
}
