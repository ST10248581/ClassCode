package abstractclasses;

/**
 *
 * @author troyk
 */

// This class cannot directly create any animal objects
public abstract class Animal {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String animalName) {
        name = animalName;
    }

    //Abstract method (has no body), the body will be provided by a concrete sublass
    public abstract void speak();
}

