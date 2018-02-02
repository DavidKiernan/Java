/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temperature;

import java.util.Scanner;

/**
 *
 * @author David
 */
public class Temperature {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
    
        TempUtility week1 = new TempUtility();

        double [] tempIn = new double[7];
        int days = 7;
        int day = 0;

        for (int i = 0 ; i < days; i++){
            System.out.println("Please enter temperature for each day " + (i +1) );
            tempIn[i] = in.nextDouble();
        }

        System.out.println("The Minimum Temperature Of The Week Is "+ week1.minTemp(tempIn));
        System.out.println("The Maximum Temperature Of The Week Is "+week1.maxTemp(tempIn));
        System.out.println("The Difference Between The Min And Max Temperature Is "+ week1.tempRange(tempIn));

        week1.print(tempIn);

        System.out.println("What Day Would You Like The Temperature Of ?");
        day = in.nextInt();
        week1.print(tempIn,day);
    }
    
}
