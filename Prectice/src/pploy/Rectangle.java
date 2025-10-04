package pploy;



public class Rectangle extends Shape{

    double len , with;

    Rectangle(double len, double with) {

        this.len = len;

        this.with = with;

    }

    double area() {

        return len * with;

    }

    

}
