package inheritancedemo;

/**
 *
 * @author troyk
 *
 * Represents the parent class Generalized class that will hold fields & methods
 * which a child will inherit
 */
public class Vehicle {

    //Fields
    String brand;
    int year;

    //Constructor
    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    // Parent class methods
    public void startEngine() {
        System.out.println("Starting the engine of the " + brand + " " + year);
    }

    public void stopEngine() {
        System.out.println("Stopping the engine of the " + brand + " " + year);
    }
}

//Subclass: car inherits from parent class Vehicle
class Car extends Vehicle {

    //Constuctor of subclass
    public Car(String brand, int year) {
        // Aplies the fields of the super class to the sub class
        super(brand, year);
    }

    public void drive() {
        System.out.println("Driving the " + brand + " car");
    }

}

class Bicycle extends Vehicle {

    public Bicycle(String brand, int year) {
        super(brand, year);
    }

    public void pedal() {
        System.out.println("Pedaling the " + year + " " + brand + " bicycle");
    }
}
