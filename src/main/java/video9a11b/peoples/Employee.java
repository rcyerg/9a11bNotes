package video9a11b.peoples;
//subclass of Person
public class Employee extends Person { //employee has access to all the methods in the person class

    private String employeeID;
    private String title;

    public Employee(){ //MUST HAVE A DEFAULT CONSTRUCTOR IN SUPER TO CALL TO, or call into another stated constructor in super.
//        super(); //calls into the default constructor of the superclass.
//        super("angie"); //calls into the 2nd constructor of the superclass.
        // MUST BE FIRST LINE OF THE SUBCLASSES CONSTRUCTOR!
        System.out.println("In Employee default constructor");
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
