package abstractclasses;

/**
 *
 * @author troyk
 */
public class AbstractClasses {

    public static void main(String[] args) {

        Dog dog = new Dog();
        Capybara capybara = new Capybara();

        System.out.println("Dog: ");
        dog.setName("Winston");
        System.out.println(dog.getName());
        dog.speak();

        System.out.println("\n");

        System.out.println("Capybara: ");
        capybara.setName("Raven");
        System.out.println(capybara.getName());
        capybara.speak();
    }

}
