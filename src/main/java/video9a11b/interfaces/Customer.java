package video9a11b.interfaces;

//11b interfaces

//all abstract methods

//no need to declare the methods as abstract

//interfaces are implements, NOT EXTENDED.

//any class that implements an interface must implements all its methods, or declare itself as abstract

public class Customer {

    public static void main(String[] args) {

//      Product book = new Product(); //cannot instantiate an interface

        Product book = new Book();
        book.setPrice(9.99);

    }
}
