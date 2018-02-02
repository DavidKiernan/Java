package product;

import java.util.Scanner;

/**
 *
 * @author David
 */
public class Product {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        double itemCost;

        System.out.println("Enter cost of the item ");
        itemCost = in.nextDouble();
        if(itemCost >= 500 && itemCost<= 5000) // item greater than or equal 500 or less than equal to 5000

        {
            System.out.println("Must get quotes");
        }
        else if(itemCost > 5000)
        {
            System.out.println("Go to the tender");
        }
        else
        {
            System.out.println("Order item");
        }
    }
    
}
