package video9a11b.abstraction;

//11a Abstraction

//Something that exists in theory, but doesn't have a concrete existence.
//we have abstract in java, a non-access level modifier.
// used for template but not intended to be used as is. Not designed to be instantiated, designed to be extended.


public class ShapeTester {
    public static void main(String[] args) {
//        Shape rectangle = new Shape(); //Shape is abstract, cannot be instantiated. Can use it as a type, but must
        //be instantiated with one of its subclasses.
        Shape rectangle = new Rectangle(5,7);
        rectangle.print(); //comes from Shape class
        System.out.println(rectangle.calculateArea()); //overridden abstract method from Rectangle class
    }
}
