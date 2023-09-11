package fruit_inheritance;

/**
 *
 * @author troyk
 */
//Subclass Banana extends Fruit
public class Banana extends Fruit {

    public Banana(String name, String colour) {
        super(name, colour);
    }

    // Overriding the method in the super class
    @Override
    public void taste() {
        System.out.println("This Banana is sweet!");
    }

}
