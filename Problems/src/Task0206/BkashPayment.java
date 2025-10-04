package Task0206;

public class BkashPayment implements Onlinepayment,SecureConnection{
    
    @Override
    public void makePayment(double amount)  {


        System.out.println("you pay: "+amount);


    }

    public void encryptData() {

        System.out.println("your data encrypted");
    }

}
