package Task0206;

public class test {
    public static void main(String[] args) {
        
        

        Onlinepayment.welcomeMessage();

        BkashPayment on ;

        on =new BkashPayment();

        on.encryptData();

        on.makePayment(500);
        on.printReceipt();
       
        
       



    }
}
