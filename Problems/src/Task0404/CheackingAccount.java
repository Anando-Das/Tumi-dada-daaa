package Task0404;

public class CheackingAccount extends Account{
    
    double withdraw, no;

    CheackingAccount(String ac, double balance, double n){

       

        this.no = n;

    }

    
    

    double withdraw(double wr) {

        this.withdraw =wr;

        System.out.println("Withdraw "+ withdraw + " from checking account "+AccountName);

        return balance = balance - withdraw; 

       

    }

}
