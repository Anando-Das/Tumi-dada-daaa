package Task0404;

public class Account {
    
    String AccountName;
    double balance,Interest;

    Account(String ac, double balance, double Interest) {

        this.AccountName = ac;

        this.balance = balance;

        this.Interest = Interest;

    }


    public void displayBalance() {
        System.out.println("Account " + AccountName + " balance: " + balance);
    }

    // double interest() {


    //     return balance*Interest;

    // }

    void addinterest() {

        balance = balance + balance*Interest;

    }

   

}
