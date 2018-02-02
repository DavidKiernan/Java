package refusetruck;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestRefuseTruck {
    public static void main(String[] args) {
        
        // Declare instance variables
        int noBins=0;
        double refuseRatePerKilo = 0.0, binWeight = 0.0;
        boolean valid1 = true;
        boolean valid2 = true, valid3 = true;

        Scanner in = new Scanner(System.in);

        while (valid1) {

            try {
                System.out.print("Enter number of bins the truck can collect: ");
                noBins = in.nextInt();
                valid1 = false;
            } catch (InputMismatchException t) {
                System.out.println("Error with Input");
                // t.printStackTrace();
                in.nextLine();
            }
        }


        while (valid2) {
            try {
                System.out.print("Enter cost per kilo: ");
                refuseRatePerKilo = in.nextDouble();
                valid2 = false;
            } catch (InputMismatchException c) {
                System.out.println("Error with Input: ");
                // c.printStackTrace();
                in.nextLine();
            }
        }


        RefuseTruck truck1 = new RefuseTruck(noBins, refuseRatePerKilo);

        while (valid3) {
            while (truck1.getMaxBins() > truck1.getNoOfBinsCollected()) {
                try {
                    System.out.print("Enter the weight for  bin " + (truck1.getNoOfBinsCollected() + 1) + " :");
                    binWeight = in.nextDouble();
                    truck1.collectBin(binWeight);
                    valid3 = false;

                } catch (InputMismatchException tr){
                    System.out.print("Error with Input\n");
                    //tr.printStackTrace();
                    in.nextLine();
                }
            }
        }
        truck1.printStats();
    }
    
}
