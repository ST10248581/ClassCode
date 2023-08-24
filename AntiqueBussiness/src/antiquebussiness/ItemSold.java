package antiquebussiness;

/**
 *
 * @author troyk
 */
public class ItemSold {

    private String invoiceNumber;
    private String description;
    private int price;

    public ItemSold(String invoiceNumber, String description, int price) {
        this.invoiceNumber = invoiceNumber;
        this.description = description;
        this.price = price;
    }

    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public String getDescription() {
        return description;
    }

    public int getPrice() {
        return price;
    }

    public void setInvoiceNumber(String newInvoiceNumber) {
        this.invoiceNumber = newInvoiceNumber;
    }

    public void setDescription(String newDescription) {
        this.description = newDescription;
    }

    public void setPrice(int newPrice) {
        this.price = newPrice;
    }
}

class LampSold extends ItemSold {

    private boolean condition;
    private int age;

    public LampSold(String invoiceNumber, String description, int price, boolean condition, int age) {
        super(invoiceNumber, description, price);
        this.condition = condition;
        this.age = age;
    }

    public boolean getCondition() {
        return condition;
    }

    public int getAge() {
        return age;
    }

    public void setCondition(boolean newCondition) {
        this.condition = newCondition;
    }

    public void setAge(int newAge) {
        this.age = newAge;
    }
}
