package static_binding;

/**
 *
 * @author troyk
 */

// Static Binding
public class Static_Binding {

    public static void main(String[] args) {
        // Known as Upcalling
        Parent object = new Child();

        // Static Binding - calls the childs method at compile time
        object.display();
    }

}
