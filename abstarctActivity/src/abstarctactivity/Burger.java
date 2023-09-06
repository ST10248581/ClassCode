package abstarctactivity;

/**
 *
 * @author troyk
 */
// Concrete class that extends from abstract class FoodItem
public class Burger extends FoodItem {

    public Burger(String name, double price) {
        super(name, price);
    }

    @Override
    public String getType() {
        return "Burger";
    }
}
