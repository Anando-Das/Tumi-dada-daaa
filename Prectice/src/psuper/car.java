package psuper;

public class car extends Vehicle{

    int gear;
    
   car(String c, double w, int g) {

        super(c, w);

    
        this.gear = g;
    

   }

   @Override

    void atteibute() {

        super.atteibute();

        System.out.println(gear);

    }

}
