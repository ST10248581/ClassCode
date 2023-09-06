package abstractclasses;

/**
 *
 * @author troyk
 */
// concrete sub class (Objects can be built)
public class Dog extends Animal {

    @Override
    public void speak() {
        System.out.println("WOOF!");
    }
}
