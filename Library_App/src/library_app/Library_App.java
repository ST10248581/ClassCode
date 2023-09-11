package library_app;

/**
 *
 * @author troyk
 */
public class Library_App {

    public static void main(String[] args) {

        // Array of objects
        LibraryItem[] libraryItems = new LibraryItem[2];

        // Populate array
        libraryItems[0] = new Book("Lord of the rings", "J.R.R Tolkien");
        libraryItems[1] = new DVD("The Hobbit", "Peter Jackson");

        Patron patron = new Patron("John");

        for (LibraryItem item : libraryItems) {
            patron.takeOut(item);
        }

        System.out.println("\n");

        for (LibraryItem item : libraryItems) {
            patron.retrunItem(item);
        }
    }

}
