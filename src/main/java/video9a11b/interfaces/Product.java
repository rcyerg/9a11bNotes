package video9a11b.interfaces;

public interface Product {

    double getPrice();

    void setPrice(double price);

    String getName();
    void setName(String name);
    void setColor(String color);

//    String getBarcode(); //breaks book if added later on, since the contract requires all methods to be implemented.

    default String getBarcode(){ //default implementation allows any other class that implements Product to access this
        //default method. Fixes the contract issue.
        return "no barcode";
    }
}
