package library_app;

/**
 *
 * @author troyk
 */

public class Patron {

    // Fields
    private final String name;

    // Constructor
    public Patron(String name) {
        this.name = name;
    }

    // Retrieves name
    public String getName() {
        return name;
    }

    public void takeOut(LibraryItem item) {
        System.out.println(name + " has taken out: ");
        item.display();
    }

    public void retrunItem(LibraryItem item) {
        System.out.println(name + " has returned: ");
        item.display();
    }

}
