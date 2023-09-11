package fruit_inheritance;

/**
 *
 * @author troyk
 */
// Super Class
public class Fruit {

    // Fields
    private String name;
    private String colour;

    // Parameterized constructor
    public Fruit(String name, String colour) {
        this.name = name;
        this.colour = colour;
    }

    // Getter and setter methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    // Parent version of method
    public void taste() {
        System.out.println("This fruit is delicious!");
    }

}
