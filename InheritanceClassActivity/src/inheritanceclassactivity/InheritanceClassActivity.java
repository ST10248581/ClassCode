package inheritanceclassactivity;

/**
 *
 * @author troyk
 */
public class InheritanceClassActivity {

    public static void main(String[] args) {

        // Create an object for each class
        Employee employee = new Employee("Troy Krause", 12000, "TK045");
        Manager manager = new Manager("Troy Krause", 12000, "TK045", "Clothing");
        Developer developer = new Developer("Troy Krause", 12000, "TK045", "C#");

        employee.introduce();
        manager.introduce();
        developer.introduce();

    }

}
