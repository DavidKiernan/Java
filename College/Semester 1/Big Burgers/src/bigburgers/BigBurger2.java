package bigburgers;

import java.util.Scanner; // needed for user input

/**
 *
 * @author David
 */
public class BigBurger2 {
     public static void main(String[] args) {
        Scanner in =  new Scanner(System.in); // 'in' is the variable that will allow input

        // price of the chips
        final double CHIP_COST = 30;
        final double CHIP_SELL = 75;
        final double BURGER_COST = 40;
        final double BURGER_SELL = 90;

        // Amount of bags and profit
        int chips;
        int burger;
        double totalProfit, chipProfit, burgerProfit;

        System.out.print("Bags of chips sold: ");
        chips = in.nextInt(); // user input
        System.out.print("Burgers sold: ");
        burger = in.nextInt();

        chipProfit = (chips * CHIP_SELL) - (chips * CHIP_COST);
        burgerProfit = (burger * BURGER_SELL) - (burger * BURGER_COST);
        totalProfit = burgerProfit + chipProfit;

        // print to console
        System.out.println("Chip Profit: " + chipProfit);
        System.out.println("Burger Profit: " + burgerProfit);
        System.out.println("Total Profit: " + totalProfit);
    }
}
