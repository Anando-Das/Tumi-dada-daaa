package Task0605;

public class Savingsaccount extends BankAccount{
    


    Savingsaccount(String accountNumber,double balance) {

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

            System.out.println(amount+" tk withdraw from account no: "+ accountNumber+" ,now current balance is"+balance);


        }else{

            System.out.println(amount+"tk not withdraw becuse limit is 500");

        }

    }

}
