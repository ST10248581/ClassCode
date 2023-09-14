package interface_demo;

/**
 *
 * @author troyk
 */
// Define an Animal Interface (Behaves like a parent class)
interface Animal {

    // Abstract methods
    void speak();

    void eat();
}

// Concrete child class that implements the parent interface
public class Lion implements Animal {

    // Implements abstract methods in parent interface:
    @Override
    public void speak() {
        System.out.println("Lion: Roar");
    }

    @Override
    public void eat() {
        System.out.println("Lion: Eats Meat");
    }
}

class Elephant implements Animal {

    @Override
    public void speak() {
        System.out.println("Elephant: Trumpet");
    }

    @Override
    public void eat() {
        System.out.println("Elephant: Eats Fruit");
    }
}

class Penguin implements Animal {

    @Override
    public void speak() {
        System.out.println("Penguin: Squak");
    }

    @Override
    public void eat() {
        System.out.println("Penguin: Eats Fish");
    }
}
