package refusetruck;

import java.util.Scanner;

public class TestRefuseTruck {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        int maxBins;
        double ratePerKg;

        System.out.println("Enter number of bins the truck can collect");
        maxBins=in.nextInt();
        System.out.println("Enter cost per kilo");
        ratePerKg=in.nextDouble();
        RefuseTruck truck1= new RefuseTruck(maxBins,ratePerKg);

        for(int i = 0; truck1.getNoBinsCollected() < maxBins; i++)
        {
            System.out.println("Enter the weight for bin " + (i+1) + ": ");
            truck1.setCollectBin(in.nextDouble());
        }
        /*while(truck1.getNoBinsCollected()<maxBins){
            
            System.out.println("Enter the weight for bin ");
            truck1.setCollectBin(in.nextDouble());
        }*/

        truck1.printStats();
    }
}
    