package moped;

import java.util.Scanner;

/**
 * @author David
 * User has to enter exactly the size
 * 50 will result in 0 where as 50cc will work as desired
 */
public class Moped {
    public static void main(String[] args) {
        
         Scanner in = new Scanner(System.in);

        // Constants
        final double DAY_SMALL_MOPETTE = 15.00;
        final double DAY_LARGE_MOP = 25.00;
        final double END_SMALL_MOPETTE = 30.00;
        final double END_LARGE_MOP = 35.00;
        final double ADD_DAY_SMALL = 2.50;
        final double ADD_DAY_LARGE = 3.50;
        final double ADD_END_SMALL = 7.50;
        final double ADD_END_LARGE = 8.50;
        final int FEE_HOURS = 3; // for the extra hours

        String type, day;
        int hour = 0, extraHour = 0;
        double fee = 0;

        System.out.println("Enter Moped Type (50cc or 250cc):");
        type = in.nextLine();

        System.out.println("Enter which part of the week rented (weekday or weekend):");
        day = in.nextLine();

        System.out.println("Enter the amount of hours used (number greater than zero):");
        hour = in.nextInt();

        extraHour = hour - FEE_HOURS;  // Calculate over 3 hours

        // Small Moped
        if (type.equals( "50cc"))
        {
            if (day.toLowerCase().equals("weekday") ){ // check for weekday//
                fee = DAY_SMALL_MOPETTE;
                if(extraHour > 0) {
                    fee = fee + (extraHour * ADD_DAY_SMALL);
                }
            }

            else {
                fee = END_SMALL_MOPETTE;
                if (extraHour > 0) {
                    fee = fee + (extraHour * ADD_END_SMALL); // overrides the fee with the current fee plus the extra
                }
            }
        }// end

        // Large Moped

        if (type.equals( "250cc"))
        {
            if (day.toLowerCase().equals("weekday") ){ // check for weekday//
                fee = DAY_LARGE_MOP;
                if(extraHour > 0) {
                    fee = fee + (extraHour * ADD_DAY_LARGE);
                }
            }

            else { // weekend//
                fee = END_LARGE_MOP;
                if (extraHour > 0) {
                    fee = fee + (extraHour * ADD_END_LARGE);
                }
            }
        } // end

        System.out.println("Fee is " + fee);
        System.out.println("Type is " + type);
        System.out.println("Time of week is " + day.toLowerCase()); // converts day to lower case
        System.out.println("hours is " + hour);
    }
    
}
