package video9a11b.chapter10;


//c10 polymorphism

//where a subclass can define their own unique behaviours but still share some of the same behaviours as their superclass

//Animal dog = new Dog();
//An object has a superclass type, but is an INSTANCE of a subclass type.
public class Zoo {

    public static void main(String[] args) {

        Dog rocky = new Dog();
        rocky.fetch();
        rocky.makeSound();
        feed(rocky); //Because the method accepts superclass of Animal,
        // we can pass in subclass objects of the superclass.

        Animal sasha = new Dog(); //instantiating sasha as a dog.
        sasha.makeSound(); //Despite still being an Animal object, it still can use  the overridden methods of Dog.
        feed(sasha);


        sasha = new Cat(); //changing sasha from a Dog instantiation to a Cat instantiation. This is possible because
        // they are both of type Animal
        sasha.makeSound();
//
//        > sasha.scratch(); //cannot make a direct call to this method, because it belongs to type Cat. sasha is still
        //type Animal. Can get around it by CASTING.


        ((Cat) sasha).scratch(); //This statement says to make sasha type Cat and run the .scratch() method.
        //The above is an example of casting
        feed(sasha); //sasha is now Cat, so feed returns the relative cat result.
    }

    public static void feed (Animal animal){

        if(animal instanceof Dog){ //instanceof checks for the subclass. Returns a boolean value based on the values
            //given.
            System.out.println("here's your dog food");
        }

        else if (animal instanceof Cat){
            System.out.println("here's your cat food");
        }

    }

}
