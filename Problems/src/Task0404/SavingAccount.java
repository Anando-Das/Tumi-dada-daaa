package Task0404;

public class SavingAccount extends Account{
    
    double addInterest;

    SavingAccount(String ac, double balance, double addInterest){

       super(ac, balance);

        this.addInterest = addInterest;

    }

    
    

    void addInterest() {

        balance = balance + (balance*addInterest);

        System.out.println("Interest added to account " + AccountName);

    }

    


}
