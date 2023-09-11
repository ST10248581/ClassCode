package fruit_inheritance;

/**
 *
 * @author troyk
 */
public class Fruit_Inheritance {

    public static void main(String[] args) {

        // Creates Apple object and Shows the Polymorphism behaviour od OOP
        Fruit apple = new Apple("Honeycrisp", "Red");

        System.out.println("APPLE: ");
        System.out.println("Name: " + apple.getName());
        System.out.println("Colour: " + apple.getColour());
        apple.taste();
    }

}
