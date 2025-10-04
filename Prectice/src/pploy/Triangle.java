package pploy;

public class Triangle extends Shape{

    double bas , hig;

    Triangle(double bas, double hig) {

        this.bas = bas;

        this.hig = hig;

    }

    double area() {

        return 0.5*hig * bas;

    }

   
}
