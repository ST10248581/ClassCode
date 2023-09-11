package library_app;

/**
 *
 * @author troyk
 */
// Parent that holds common library items
public class LibraryItem {

    // Fields
    private final String title;

    // Parameterized constructor (Sets title)
    public LibraryItem(String title) {
        this.title = title;
    }

    //Retrieves title
    public String getTitle() {
        return title;
    }

    // Displays title
    public void display() {
        System.out.println("Title: " + title);
    }
}
