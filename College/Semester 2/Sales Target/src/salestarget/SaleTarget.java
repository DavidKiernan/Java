package salestarget;

import java.util.Scanner;

/**
 *
 * @author David
 */
public class SaleTarget {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        
        //Double
        double target;
        double sum = 0;
        double totalSales = 0;
        double indivTarget = 0;

        //Integers
        int count = 0;

        double[][] sales = new double [4][5];
        double[] indieTarget = new double [4];

        System.out.println("Enter the weekly target");
        target = in.nextDouble();
    
    
        // Loop through the employees
        for(int i = 0; i < sales.length; i++){
          System.out.println("Enter the target for employee " +(i +1));
          indieTarget[i] = in.nextDouble();
          indivTarget = 0;
          sum = 0;
            // Loop through Days of week
            for(int j = 0; j < sales[0].length; j++){
                System.out.println("Enter sales figure for employee " +(i+1) + " for day " +(j+1));
                sales[i][j] = in.nextDouble();
                sum = sum + sales[i][j];
                totalSales = totalSales + sum ;
                indivTarget = indivTarget + sales[i][j];
            }
            System.out.println("The total sales for employee " +(i+1) + " was " +sum); 
            if (sum < target){
                sum=target-sum;
                System.out.println("The sales of employee " +(i+1) + " was less than the weekly target " +target + " by " +sum );
            }
            else{
                count = count + 1;
                sum = sum-target;
                System.out.println("The sales of employee " +(i+1) + " was greater than the weekly target " +target + " by " +sum );
            }
            if (indivTarget < indieTarget[i]){
                System.out.println("The sales of employee " +(i+1) + " was less than their individual target of " +indieTarget[i] + " by " +indivTarget );
            }
            else{
                indivTarget = indivTarget - indieTarget[i];
                System.out.println("The sales of employee " +(i+1) + " was greater than their individual target of " +indieTarget[i] + " by " +indivTarget);
            }
            System.out.println("\n");
        } // End Loop for Employees
        System.out.println("The total sales for the week was " +totalSales + " and the number of employees over the target was " +count);
    } 
}
