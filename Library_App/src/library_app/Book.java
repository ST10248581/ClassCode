package library_app;

/**
 *
 * @author troyk
 */
// Sub class of LibraryItem
public class Book extends LibraryItem {

    // Fields
    private final String author;

    // Constructor
    public Book(String title, String author) {
        super(title);
        this.author = author;
    }

    // Retrives Author
    public String getAuthor() {
        return author;
    }

    @Override
    public void display() {
        System.out.println("BOOK: ");
        super.display();
        System.out.println("Author: " + author);
    }
}
