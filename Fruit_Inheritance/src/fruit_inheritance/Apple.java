package fruit_inheritance;

/**
 *
 * @author troyk
 */
// Subclass Apple extends the fruit class
public class Apple extends Fruit {

    public Apple(String name, String colour) {
        super(name, colour);
    }

    // Overriding the method in the super class
    @Override
    public void taste() {
        System.out.println("This Apple is sweet!");
    }
}
