package antiquebussiness;

/**
 *
 * @author troyk
 */
public class AntiqueBussiness {

    public static void main(String[] args) {

        ItemSold table = new ItemSold("T132", "Antique Cherry Table", 1500);
        ItemSold chair = new ItemSold("C132", "Antique Cherry Chair", 600);

        LampSold bigLamp = new LampSold("L333", "Big brass Lamp", 1900, true, 60);
        LampSold smallLamp = new LampSold("L300", "small silver Lamp", 2900, false, 100);

        String invoice;
        String description;
        int price;
        boolean condition;
        int age;

        //Table
        invoice = table.getInvoiceNumber();
        description = table.getDescription();
        price = table.getPrice();

        System.out.println("Table: \n" + "Invoice: " + invoice + "\n Description: " + description + "\n Price: R" + price);

        table.setInvoiceNumber("T144");
        table.setDescription("Cherry Table");
        table.setPrice(1000);

        invoice = table.getInvoiceNumber();
        description = table.getDescription();
        price = table.getPrice();

        System.out.println("Table: \n" + "Invoice: " + invoice + "\n Description: " + description + "\n Price: R" + price + "\n");

        //Chair
        invoice = chair.getInvoiceNumber();
        description = chair.getDescription();
        price = chair.getPrice();

        System.out.println("Chair: \n" + "Invoice: " + invoice + "\n Description: " + description + "\n Price: R" + price);

        chair.setInvoiceNumber("C144");
        chair.setDescription("Chair");
        chair.setPrice(1000);

        invoice = chair.getInvoiceNumber();
        description = chair.getDescription();
        price = chair.getPrice();

        System.out.println("Chair: \n" + "Invoice: " + invoice + "\n Description: " + description + "\n Price: R" + price + "\n");

        // Big Lamp
        invoice = bigLamp.getInvoiceNumber();
        description = bigLamp.getDescription();
        price = bigLamp.getPrice();
        condition = bigLamp.getCondition();
        age = bigLamp.getAge();

        System.out.println("Big Lamp: \n" + "Invoice: " + invoice + "\n Description: " + description + "\n Price: R" + price + "\n Damaged: " + condition + " \n Age: " + age);

        bigLamp.setInvoiceNumber("L144");
        bigLamp.setDescription("Big copper lamp");
        bigLamp.setPrice(5000);
        bigLamp.setCondition(false);
        bigLamp.setAge(300);

        invoice = bigLamp.getInvoiceNumber();
        description = bigLamp.getDescription();
        price = bigLamp.getPrice();

        System.out.println("Big Lamp: \n" + "Invoice: " + invoice + "\n Description: " + description + "\n Price: R" + price + "\n Damaged: " + condition + " \n Age: " + age + "\n");

        //Small Lamp
        invoice = smallLamp.getInvoiceNumber();
        description = smallLamp.getDescription();
        price = smallLamp.getPrice();
        condition = smallLamp.getCondition();
        age = smallLamp.getAge();

        System.out.println("Small Lamp: \n" + "Invoice: " + invoice + "\n Description: " + description + "\n Price: R" + price + "\n Damaged: " + condition + " \n Age: " + age);

        smallLamp.setInvoiceNumber("L144");
        smallLamp.setDescription("Big copper lamp");
        smallLamp.setPrice(5000);
        smallLamp.setCondition(false);
        smallLamp.setAge(300);

        invoice = smallLamp.getInvoiceNumber();
        description = smallLamp.getDescription();
        price = smallLamp.getPrice();

        System.out.println("Small Lamp: \n" + "Invoice: " + invoice + "\n Description: " + description + "\n Price: R" + price + "\n Damaged: " + condition + " \n Age: " + age);

    }

}
