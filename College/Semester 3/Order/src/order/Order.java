package order;

public class Order {
    
    private String custName;        //"cust" IS SHORT FOR CUSTOMER
    private int custNum;
    private int quantityOrd;
    private double unitPrice;
    protected double totalPrice;

    //CONSTRUCTOR

    public Order(String custNameIn, int custNumIn, int quantityOrdIn, double unitPriceIn) {
        custName = custNameIn;
        custNum = custNumIn;
        quantityOrd = quantityOrdIn;
        unitPrice = unitPriceIn;
    }

    //SETTER & GETTER METHODS

    public void setCustName(String newName) {
        custName = newName;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustNum(int num) {
        custNum = num;
    }

    public int getCustNum() {
        return custNum;
    }

    public void setQuantityOrd(int order) {
        quantityOrd = order;
    }

    public int getQuantityOrd(){
        return quantityOrd;
    }

    public void setUnitPrice(double newUnitPrice){
       unitPrice=newUnitPrice;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    //TOTAL PRICE

    public void calTotalPrice(){
     totalPrice = quantityOrd * unitPrice;
    }

    public double getTotalPrice() {
      return totalPrice;
    }

    //PRINT METHOD
    public void print(){
        System.out.println("Customer Name: "+ custName);
        System.out.println("Customer Number: "+ custNum);
        System.out.println("Quantity Ordered: "+ quantityOrd);
        System.out.println("Unit Price: "+ unitPrice);
        System.out.println("Total Price: "+ totalPrice);
    }
}
