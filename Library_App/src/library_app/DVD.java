package library_app;

/**
 *
 * @author troyk
 */
//Subclass of LibraryItem
public class DVD extends LibraryItem {

    // Fields
    private String director;

    //Constructor
    public DVD(String title, String director) {
        super(title);
        this.director = director;
    }

    // Retrieves director
    public String getDirector() {
        return director;
    }

    @Override
    public void display() {
        System.out.println("DVD: ");
        super.display();
        System.out.println("Director: " + director);
    }

}
