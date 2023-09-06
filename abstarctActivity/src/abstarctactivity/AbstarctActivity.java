package abstarctactivity;

/**
 *
 * @author troyk
 */
public class AbstarctActivity {

    public static void main(String[] args) {

        Burger burger = new Burger("Big Burger", 39.99);

        displayFoodItemDetails(burger);
    }

    public static void displayFoodItemDetails(FoodItem item) {
        System.out.println("Type: " + item.getType());
        System.out.println("Name: " + item.getName());
        System.out.println("Price: R" + item.getPrice());
    }
}
