package shop;

import java.util.Scanner;

/**
 *
 * @author David
 */
public class Shop2 {
     public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        // Constants
        final double APPLES = 0.3;
        final double CARROTS = 1.25;
        final double ORANGES = 0.45;
        final double POTATOES = 3.25;
        final double STRAWBERRIES = 2.30;
        final double TURNIPS = 0.70;
        final String USERNAME = "Initial";
        final String PASSWORD = "Moodle";
        
        double totalPrice, priceItem1 = 0, priceItem2 = 0, priceItem3 = 0;
        int qtyItem1, qtyItem2, qtyItem3;
        String boxItem1, boxItem2, boxItem3;
        String username, password; // user input
       // String nameBox, addressBox;
        String dummy; // dummy input to allow program to work

        // Login
        System.out.println("Enter Username");
        username = in.nextLine();
        System.out.println("Enter Password");
        password  = in.nextLine();

        // not correct username or password
        if (!username.equals(USERNAME) || !password.equals(PASSWORD))
        {
            System.err.println("username or password is wrong");
        }
        else {

            //

            // display items & price
            System.out.println("------- SHOP MENU --------");
            System.out.println("\tApples: £ " + APPLES + "\n\tCarrots: £ " + CARROTS);
            System.out.println("\tOranges: £ " + ORANGES + "\n\tPotatoes: £ " + POTATOES);
            System.out.println("\tStrawberries: £ " + STRAWBERRIES + "\n\tTurnips: £ " + TURNIPS);
            System.out.println("--------------------------");

            // Getting the user input for each Item
            System.out.println("Enter Item");
            boxItem1 = in.nextLine();
            System.out.println("Enter quantity");
            qtyItem1 = in.nextInt();
            if (boxItem1.equalsIgnoreCase("apples")) {
                System.out.println(APPLES * qtyItem1);
                priceItem1 = APPLES * qtyItem1;
            }
            if (boxItem1.equalsIgnoreCase("oranges")) {
                System.out.println(ORANGES * qtyItem1);
                priceItem1 = ORANGES * qtyItem1;
            }
            if (boxItem1.equalsIgnoreCase("turnips")) {
                System.out.println(TURNIPS * qtyItem1);
                priceItem1 = TURNIPS * qtyItem1;
            }
            if (boxItem1.equalsIgnoreCase("carrots")) {
                System.out.println(CARROTS * qtyItem1);
                priceItem1 = CARROTS * qtyItem1;
            }
            if (boxItem1.equalsIgnoreCase("potatoes")) {
                System.out.println(POTATOES * qtyItem1);
                priceItem1 = POTATOES * qtyItem1;
            }
            if (boxItem1.equalsIgnoreCase("strawberries")) {
                System.out.println(STRAWBERRIES * qtyItem1);
                priceItem1 = STRAWBERRIES * qtyItem1;
            }

            // item 2
            dummy = in.nextLine();
            System.out.println("Enter Item");
            boxItem2 = in.nextLine();
            System.out.println("Enter quantity");
            qtyItem2 = in.nextInt();
            if (boxItem2.equalsIgnoreCase("apples")) {
                System.out.println(APPLES * qtyItem2);
                priceItem2 = APPLES * qtyItem2;
            }
            if (boxItem2.equalsIgnoreCase("oranges")) {
                System.out.println(ORANGES * qtyItem2);
                priceItem2 = ORANGES * qtyItem2;
            }
            if (boxItem2.equalsIgnoreCase("turnips")) {
                System.out.println(TURNIPS * qtyItem2);
                priceItem2 = TURNIPS * qtyItem2;
            }
            if (boxItem2.equalsIgnoreCase("carrots")) {
                System.out.println(CARROTS * qtyItem2);
                priceItem2 = CARROTS * qtyItem2;
            }
            if (boxItem2.equalsIgnoreCase("potatoes")) {
                System.out.println(POTATOES * qtyItem2);
                priceItem2 = POTATOES * qtyItem2;
            }
            if (boxItem2.equalsIgnoreCase("strawberries")) {
                System.out.println(STRAWBERRIES * qtyItem2);
                priceItem2 = STRAWBERRIES * qtyItem2;
            }

            // item 3
            dummy = in.nextLine(); // dummy line for a bug
            System.out.println("Enter Item");
            boxItem3 = in.nextLine();
            System.out.println("Enter quantity");
            qtyItem3 = in.nextInt();
            if (boxItem3.equalsIgnoreCase("apples")) {
                System.out.println(APPLES * qtyItem3);
                priceItem3 = APPLES * qtyItem3;
            }
            if (boxItem3.equalsIgnoreCase("oranges")) {
                System.out.println(ORANGES * qtyItem3);
                priceItem3 = ORANGES * qtyItem3;
            }
            if (boxItem3.equalsIgnoreCase("turnips")) {
                System.out.println(TURNIPS * qtyItem3);
                priceItem3 = TURNIPS * qtyItem3;
            }
            if (boxItem3.equalsIgnoreCase("carrots")) {
                System.out.println(CARROTS * qtyItem3);
                priceItem3 = CARROTS * qtyItem3;
            }
            if (boxItem3.equalsIgnoreCase("potatoes")) {
                System.out.println(POTATOES * qtyItem3);
                priceItem3 = POTATOES * qtyItem3;
            }
            if (boxItem3.equalsIgnoreCase("strawberries")) {
                System.out.println(STRAWBERRIES * qtyItem3);
                priceItem3 = STRAWBERRIES * qtyItem3;
            }

            // Display total price
            totalPrice = priceItem1 + priceItem2 + priceItem3;
            System.out.format("Total Price: €%.2f%n", totalPrice);
        }

    }
}
