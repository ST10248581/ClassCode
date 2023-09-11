package fruit_inheritance;

/**
 *
 * @author troyk
 */
public class Fruit_Inheritance {

    public static void main(String[] args) {
        //Create Fruit array (Array of Objects)
        Fruit[] fruits = new Fruit[2];

        // Popoulate array with objects
        fruits[0] = new Apple("HoneyCrisp", "Red");
        fruits[1] = new Banana("Cavendish", "Yellow");

        // Creating an array of objects allows us to use dynamic binding as we are not specifying what object we are using
        for (Fruit fruit : fruits) {
            System.out.println("Fruit: ");
            System.out.println("Name: " + fruit.getName());
            System.out.println("Colour: " + fruit.getColour());
            fruit.taste();
            System.out.println("\n");
        }
    }

}
