package video9a11b.chapter9cShapes;

public class Square extends Rectangle{

    @Override //good practice for checking method is actually being overridden, not required however.
    public double calculatePerimeter(){ //same method name and signature, but different body.
        return sides * length;
    }

    //cannot declare the access modifier as anything stricter than the original, even when @Overriding.
    //Could not change to protected/private. However, you can make it looser ex. protected to public.

    public void print(String what){ //Method overloading.
        System.out.println("I am a " + what);
    }
}
