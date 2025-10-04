package Task0605;

public class CheakingAccount extends BankAccount{
    

    CheakingAccount(String accountNumber,double balance) {

        super(accountNumber, balance);

        

    }



    @Override
    void deposite(double amount) {

        balance =  balance + amount;

        System.out.println(amount+" tk deposite account no: "+ accountNumber);

    }
    void witdraw(double amount){

        if (balance>500) {
            
            balance = balance - amount;

            System.out.println(amount+" tk withdraw from Cheaking account no: "+ accountNumber+" ,now current balance is"+balance);


        }else{

            System.out.println(amount+"tk not withdraw becuse your Cheaking account  limit is 500");

        }

    }

}
