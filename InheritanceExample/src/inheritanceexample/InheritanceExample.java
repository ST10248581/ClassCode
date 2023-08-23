package inheritanceexample;

/**
 *
 * @author troyk
 */
public class InheritanceExample {

    public static void main(String[] args) {

        //Create Instance
        Dog dog = new Dog("Loki", "Black", 4, 6, true, 2);
        Cat cat = new Cat("Peaches", "Ginger", 3, 5, false, 1);
        Bird bird = new Bird("Tweety", "Blue", 5, 7, true, 3);
        Unicorn unicorn = new Unicorn("Pony", "Pink", 2, 4, false, 1);

        dog.feed();
        dog.play();
        dog.sleep();
        dog.bath();
        dog.printStatus();

        System.out.println(" ");

        cat.feed();
        cat.play();
        cat.sleep();
        cat.bath();
        cat.printStatus();

        System.out.println(" ");

        bird.feed();
        bird.play();
        bird.sleep();
        bird.bath();
        bird.printStatus();

        System.out.println(" ");

        unicorn.feed();
        unicorn.play();
        unicorn.sleep();
        unicorn.bath();
        unicorn.printStatus();
    }


}
