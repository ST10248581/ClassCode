package static_binding;

/**
 *
 * @author troyk
 */
public class Parent {
    void display() {
        System.out.println("Parents display method");
    }
}

class Child extends Parent {

    @Override
    void display() {
        System.out.println("Childs display method");
    }
}
