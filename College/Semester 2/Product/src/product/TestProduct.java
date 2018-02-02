package product;

/**
 *
 * @author David
 */
public class TestProduct {
    public static void main(String args[]){
        Product prod1 = new Product();
    
        prod1.setproductName("Hammer");
        prod1.setproductCode(12234);
        prod1.setonHand(21);
        prod1.setcostPrice(10);
        prod1.setsellingPrice(15);

        prod1.print();

        prod1.setproductName("Hammer");
        prod1.setproductCode(12234);
        prod1.setonHand(21);
        prod1.setcostPrice(10);
        prod1.setsellingPrice(15);
        prod1.setstockIn(9);

        prod1.print();
    }
    
}
