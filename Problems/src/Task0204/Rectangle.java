package Task0204;

public class Rectangle extends Shape{
    double length, width;

    Rectangle(double length, double width) {

        this.length = length;
        this.width = width;
        
            
    }

    @Override

    public void displayType() {

        System.out.println("Types of shape:Rectangle");

    }
}
