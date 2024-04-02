package video9a11b.peoples;

//9a notes

//four major principles: encapsulation, inheritance, polymorphism, abstraction.
//inheritance is where one class inherits the properties of another.
//Superclass - subclass. Parent - child.
//subclasses should be a more specialized form of the superclass.
//inheritance relationship known as a "is a" relationship.

//9d notes

//inheritance limits: Constructors are not inherited, all public and protected methods and fields ARE inherited
//cont. : private methods and fields are NOT inherited, final methods ARE inherited but CANNOT be overridden.




public class InheritanceTester {
    public static void main(String[] args) {
//      Person person = new Person();
        Employee employee = new Employee();
//      employee. //contains all the methods from person, and employee.
        Mother mom = new Mother();


//      mom. //chain of inheritance, has access to methods and fields in Woman class, and Person class
        mom.setName("Sally");

        System.out.println(mom.getName() + "is a " + mom.getGender());
    }
}
