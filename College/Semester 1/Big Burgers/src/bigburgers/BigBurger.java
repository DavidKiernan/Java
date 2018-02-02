package bigburgers;

/**
 *
 * @author David Kiernan
 */
public class BigBurger {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // variables whose value won't change
        final int CHIP_COST = 30;
        final int CHIP_SELL = 75;
        final int BURGER_COST = 40;
        final int BURGER_SELL = 90;

        // variable that will change
        int chips, chipProfit;
        int burger, burgerProfit;
        int totalProfit;

        chips = 10;
        chipProfit = (chips*CHIP_SELL) - (chips * CHIP_COST);
        burger = 15;
        burgerProfit = (burger * BURGER_SELL) - (burger * BURGER_COST);

        // total profit for the chips & burgers
        totalProfit = chipProfit + burgerProfit;

        // print to console
        System.out.println("Chip Profit: " + chipProfit);
        System.out.println("Burger Profit: " + burgerProfit);
        System.out.println("Total Profit: " + totalProfit);

    }
    
}
