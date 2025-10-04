package pploy;

public class test {
    public static void main(String[] args) {
        
        Shape[] s = new Shape[2] ;

        s[0] = new Rectangle(15, 10);

        

        s[1] = new Triangle(15, 10);


        for(int i= 0; i<=1; i++){

            System.out.println(s[i].area());

        }

        
        

    }
}
