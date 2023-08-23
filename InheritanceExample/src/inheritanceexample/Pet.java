package inheritanceexample;

/**
 *
 * @author troyk
 */
public class Pet {

    // Fields
    private final String name;
    private final String colour;
    private int hunger;
    private int happiness;
    private int energyLevel;
    private boolean isClean;

    //Constructor
    public Pet(String name, String colour, int hunger, int happiness, boolean isClean, int energyLevel) {
        this.name = name;
        this.colour = colour;
        this.hunger = hunger;
        this.happiness = happiness;
        this.isClean = isClean;
        this.energyLevel = energyLevel;
    }

    //Behaviours
    public void feed() {
        if (hunger < 2 && hunger > 0) {
            hunger = 5;
        }
    }

    public void play() {
        if (happiness < 5 && happiness > 0) {
            happiness = 10;
        }
    }

    public void sleep() {
        if (energyLevel == 3 || happiness < 4 && hunger == 3) {
            energyLevel = 5;
        }
    }

    public void bath() {
        if (!isClean) {
            isClean = true;
        }
    }

    public void printStatus() {
        System.out.println("Your " + colour + " pet " + name + "'s levels are: \n Hunger: " + hunger + "\n Happiness: " + happiness + "\n Energy Level: " + energyLevel + "\n Clean: " + isClean);
    }
}

class Dog extends Pet {

    public Dog(String name, String colour, int hunger, int happiness, boolean isClean, int energyLevel) {
        super(name, colour, hunger, happiness, isClean, energyLevel);
    }

}

class Cat extends Pet {

    public Cat(String name, String colour, int hunger, int happiness, boolean isClean, int energyLevel) {
        super(name, colour, hunger, happiness, isClean, energyLevel);

    }
}

class Bird extends Pet {

    public Bird(String name, String colour, int hunger, int happiness, boolean isClean, int energyLevel) {
        super(name, colour, hunger, happiness, isClean, energyLevel);

    }
}

class Unicorn extends Pet {

    public Unicorn(String name, String colour, int hunger, int happiness, boolean isClean, int energyLevel) {
        super(name, colour, hunger, happiness, isClean, energyLevel);

    }
}
