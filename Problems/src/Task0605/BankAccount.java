package Task0605;

public abstract class BankAccount {
    
    String accountNumber;
    double balance;

    BankAccount(String accountNumber,double balance) {

        this.accountNumber = accountNumber;

        this.balance = balance;

    }



    abstract void deposite(double amount);
    abstract void witdraw(double amount);
}
