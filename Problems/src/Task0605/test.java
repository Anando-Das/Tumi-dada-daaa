package Task0605;

public class test {
    
    public static void main(String[] args) {
        
        BankAccount bn;

        bn = new Savingsaccount("SA001", 1200);

        bn.deposite(200);
        bn.witdraw(500);

        bn = new CheakingAccount("CA001", 300);

        bn.deposite(200);
        bn.witdraw(600);





    }


}
