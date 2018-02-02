package coffeeshop;

/**
 *
 * @author David
 */
import java.util.Scanner;
public class CoffeeShop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        // Constants on carton price & capacity
        final double PRICE_PER_2LB_BAG = 5.50;
        final double LRG_CTN_PRICE = 1.80;
        final double MED_CTN_PRICE = 1.00;
        final double SML_CTN_PRICE = 0.60;
        final int LRG_CTN_CAP = 20;
        final int MED_CTN_CAP = 10;
        final int SML_CTN_CAP = 5;

        double coffeeCost, totalCost = 0, totalPrice, discount = 0, discountRate, catonCost = 0;
        int numberOfBagsOrdered, lrgCtnCount = 0, medCtnCount =0, smlCtnCount = 0, numBagsLeft;


        System.out.println(" Enter number of bags sold ");
        numberOfBagsOrdered = in.nextInt();

        coffeeCost = numberOfBagsOrdered * PRICE_PER_2LB_BAG;
           
        // No Discount when less than 25 bags ordered
        if(numberOfBagsOrdered < 25)
        {
            discountRate = 0.0;
            System.out.println(" The discount is: " + discountRate);
            System.out.println( " Total Price is: " + coffeeCost);
        }
        else
        {
            System.out.println( " Total Price is: " + coffeeCost);
        }
    }
}
  
