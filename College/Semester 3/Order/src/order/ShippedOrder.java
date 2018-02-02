package order;

public class ShippedOrder extends Order{
     private final int handling = 5;

    //CONSTRUCTOR
    public ShippedOrder(String custNameIn, int custNumIn, int quantityOrdIn, double unitPriceIn){
        super(custNameIn,custNumIn,quantityOrdIn,unitPriceIn);
    }

    //HANDLING CHARGE + TOTAL COST OVERRIDING THE TOTALPRICE

    public void calcTotalPrice(){
        super.calTotalPrice();
        totalPrice +=handling;
    }


     @Override
    public double getTotalPrice() {
      return totalPrice;
    }

    //PRINT METHOD
     @Override
    public void print(){
        super.print();
        System.out.println("Shipping has been added");
    }
}
