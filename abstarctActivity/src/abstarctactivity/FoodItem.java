package abstarctactivity;

/**
 *
 * @author troyk
 */
// Abstract class with constructor (blueprint for specific food item classes)
public abstract class FoodItem {

    //Fields
    private String name;
    private double price;

    //Constructor
    public FoodItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Abstract Method
    public abstract String getType();

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setprice(double price) {
        this.price = price;
    }
}
