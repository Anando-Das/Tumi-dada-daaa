package Task0206;

public interface Onlinepayment {

    double TRANSACTION_FEE = 15.0;

    void makePayment(double amount);

    default void printReceipt() {
        
        System.out.println("Transaction complete. Fee: 15.");

    }

    static void welcomeMessage(){

        System.out.println("Welcome to Online Payment Portal");

    }

    

}
