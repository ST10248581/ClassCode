package inheritanceclassactivity;

/**
 *
 * @author troyk
 */
public class Employee {

    //Fields
    String name;
    double salary;
    String empID;

    //Constructor
    public Employee(String name, double salary, String empID) {
        this.name = name;
        this.salary = salary;
        this.empID = empID;
    }

    //Super class Methods
    public void introduce() {
        System.out.println("Hello, I'm " + name + " & I'm an emplouee at tesla");
    }
}

//subclass
class Manager extends Employee {

    // Fields
    String department;

    // *Information Hiding* when a subclass has its own fields which the super class does not know about
    public Manager(String name, double salary, String empID, String department) {
        super(name, salary, empID);
        this.department = department;
    }

    @Override
    public void introduce() {
        System.out.println("Hello, I'm " + name + " & I am the manager for the " + department + " Department");
    }
}

    //Subclass
class Developer extends Employee {

    //Fields
    String programmingLanguage;

    public Developer(String name, double salary, String empID, String programmingLanguage) {
        super(name, salary, empID);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void introduce() {
        System.out.println("Hello, I'm " + name + " & I program in " + programmingLanguage);
    }

}
