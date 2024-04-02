package video9a11b.chapter9cShapes;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();

        rectangle.print(); //only one print method available to rectangle class

        Square square = new Square();

        square.print(); //two print methods available: default one in rectangle class that was inherited, and overloaded method.
    }
}
