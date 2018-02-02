package tax;

public class Invoice implements IPayable{
    private String description;
    private String number;
    private double price;
    private int quantity;
    private static int inCount;
    private static double vat;

    public Invoice(){
        description="";
        number="";
        price=0.0;
        quantity=0;
    }
    public Invoice(String d, String n, double p, int q){
        description=d;
        number=n;
        price=p;
        quantity=q;
        inCount++;
    }

    public static int inCount(){return inCount ;}

    public static double vat(){return vat;}

    public void setDescription(String d) {
        description = d;
    }

    public String getDescription() {
        return description;
    }

    public void setNumber(String n) {
        number = n;
    }

    public String getNumber() {
        return number;
    }

    public void setPrice(double p) {
        price = p;
    }

    public double getPrice() {

        return price;
    }

    public void setQuantity(int q) {
        quantity = q;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "\nInvoice" +"\n description "+description+"\n number "+number+"\n price "+price+"\n quantity "+quantity;
    }

    @Override
    public double getPaymentAmount() {
        vat= (price * quantity + ((price * quantity) * VATRATE))-price*quantity;
        return (price * quantity+ ((price * quantity )* VATRATE));
    }
}
