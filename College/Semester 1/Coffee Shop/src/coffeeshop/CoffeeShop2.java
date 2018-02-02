package coffeeshop;
import java.util.Scanner;
/**
 *
 * @author David
 */
public class CoffeeShop2 {
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

        // Variables

        double coffeeCost, cartonCost, totalCost, totalPrice, discount, discountRate;
        int bagsOrdered, bagsRemaining, lrgCtnCount = 0, medCtnCount = 0, smlCtnCount = 0;

        // Getting the bags
        System.out.print("Enter number of bags: ");
        bagsOrdered = in.nextInt();
        bagsRemaining = bagsOrdered;

        // sorting into containers
        if (bagsRemaining / LRG_CTN_CAP > 0) // bags remaining / large capacity greater than 0
        {
            lrgCtnCount = lrgCtnCount + (bagsRemaining / LRG_CTN_CAP);
            bagsRemaining = bagsRemaining % LRG_CTN_CAP;  // modding
        }

        if (bagsRemaining / MED_CTN_CAP > 0) // bags remaining / large capacity greater than 0
        {
            medCtnCount = medCtnCount + (bagsRemaining / MED_CTN_CAP);
            bagsRemaining = bagsRemaining % MED_CTN_CAP;  // modding
        }

        if (bagsRemaining / SML_CTN_CAP > 0) // bags remaining / large capacity greater than 0
        {
            smlCtnCount = smlCtnCount + (bagsRemaining / SML_CTN_CAP);
            bagsRemaining = bagsRemaining % SML_CTN_CAP;  // modding
        }

        // any bags remaining use small container
        if (bagsRemaining > 0) {
            smlCtnCount += 1;
        }

        // Cost of the cartons
        cartonCost = ((lrgCtnCount * LRG_CTN_PRICE) + (medCtnCount * MED_CTN_PRICE) + (smlCtnCount * SML_CTN_PRICE));

        coffeeCost = bagsOrdered * PRICE_PER_2LB_BAG;

        // calculate discount

        if (bagsOrdered < 25) {
            discountRate = 0;
        } else if (bagsOrdered < 50) {
            discountRate = 0.05; // 5%
        } else if (bagsOrdered < 100) {
            discountRate = 0.10; // 10%
        } else if (bagsOrdered < 150) {
            discountRate = 0.15;
        } else if (bagsOrdered < 200) {
            discountRate = 0.20;
        } else if (bagsOrdered < 300) {
            discountRate = 0.25;
        } else // more than 300 bags ordered
        {
            discountRate = 0.3;
        }

        // Calculating Price
        totalPrice = coffeeCost + cartonCost;
        discount = coffeeCost * discountRate;

        // total price with the discount
        totalCost = (coffeeCost - discount) + cartonCost;

        // Displaying
        System.out.println("Number of bags ordered: " + bagsOrdered);
        System.out.println("Price before discount: " + totalPrice);
        System.out.println("Discount: " + discount);
        System.out.println("Total cost: " + totalCost);
    }
    
}
