package video9a11b.abstraction;

public class Rectangle extends Shape{ //MUST declare as abstract or IMPLIMENT ABSTRACT METHODS from superclass.

    private double length;
    private double width;

    public Rectangle (double length, double width){
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override //Syntax requires an override of abstract method
    double calculateArea() {
        return length * width;
    }
}
