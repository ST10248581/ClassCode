package inheritancedemo;

/**
 *
 * @author troyk
 */

public class InheritanceDemo {

    public static void main(String[] args) {

        // Create objects from the child class with use of the parameterized constructor from the parent
        Car car = new Car("Toyota", 2023);
        Bicycle bicycle = new Bicycle("Schwinn", 2022);

        car.startEngine();
        car.drive();
        car.stopEngine();

        bicycle.pedal();

    }

}
