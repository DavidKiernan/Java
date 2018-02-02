import java.io.*;

/**
 * Created by David on 12/03/2015.
 */
public class Stock implements Serializable{
    private static final long serialVersionUID = 1L;
    int idNumber, quantity;
    String description;

    public Stock(String description, int idNumber, int quantity) {
        this.description = description;
        this.idNumber = idNumber;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return ("Description: " + description + " Id Number: " + idNumber + " Quantity: " + quantity);
    }
}
