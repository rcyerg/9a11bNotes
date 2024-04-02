package video9a11b.abstraction;

public abstract class Shape {

    abstract double calculateArea(); //abstract methods only have a return type and signature, no body. CLASS MUST
    //BE ABSTRACT IF IT CONTAINS AN ABSTRACT METHOD
    public void print(){
        System.out.println("I am a shape"); //abstract method doesn't have to contain all abstract methods!
    }
}
