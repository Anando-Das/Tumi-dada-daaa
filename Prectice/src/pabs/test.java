package pabs;

public class test {
    public static void main(String[] args) {
        
        Shape[] ob= new Shape[2]  ;

        ob[0] = new Circle(20);

        ob[1] = new Rectangle(20,20);

        for(int i =0; i<=1;i++ ) {

            System.out.println(ob[i].area());

        }
        

    }
}
