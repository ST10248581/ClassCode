package interface_demo;

/**
 *
 * @author troyk
 */
public class Interface_Demo {

    public static void main(String[] args) {

        // Create instances of different child classes
        Animal lion = new Lion();
        Animal elephant = new Elephant();
        Animal penguin = new Penguin();

        // Display
        System.out.println("Welcome to the Zoo");
        System.out.println("\n---Lion---");
        lion.speak();
        lion.eat();

        System.out.println("\n---Elephant---");
        elephant.speak();
        elephant.eat();

        System.out.println("\n---Penguin---");
        penguin.speak();
        penguin.eat();

    }
}
