package exercise;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Scanner;
import java.util.TimeZone;

public class Exercise {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        // Q46 Java program to display the system time
        System.out.print("Q46. Java program to display the system time");
        System.out.format("\nCurrent Date time: %tc%n\n", System.currentTimeMillis());
    
        // Q47. display the current date time in specific format
        System.out.print("Q47. Display the current date time in specific format");
        SimpleDateFormat cdt = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS");
        cdt.setCalendar(Calendar.getInstance(TimeZone.getTimeZone("GMT")));
        System.out.println("\nNow: "+cdt.format(System.currentTimeMillis()));
	System.out.format("Another Way\nNow: %s%n", LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss.SSS")));
    
        // Q48 Print the odd numbers from 1 to 99. Prints one number per line
        System.out.print("Q48 Print the odd numbers from 1 to 99");
        for(int i = 0; i < 100; i++)
        {
            if(i % 2 != 0 )
            {
                System.out.println(i);
            }
        }
    
        // Q49. accept a number and check the number is even or not. Prints 1 if the number is even or 0 if the number is odd
        System.out.print("Q49. accept a number and check the number is even or not.\nPrints 1 if the number is even or 0 if the number is odd");
        System.out.print("\nInput Number: ");
        int number49 = in.nextInt();
        if(number49 % 2 == 0)
        {
            System.out.println(1);
        }
        else{
            System.out.println(0);
        }

        // Q50 print numbers between 1 to 100 which are divisible by 3, 5 and by both
        System.out.println("Q50 print numbers between 1 to 100 which are divisible by 3, 5 and by both");
        System.out.println("Divided by 3");
        for (int i =1; i <= 100; i++)
        {
            if(i % 3 == 0)
                System.out.print(i + ", ");
        }
        System.out.println("\nDivided by 5");
        for (int i =1; i <= 100; i++)
        {
            if(i % 5 == 0)
                System.out.print(i + ", ");
        }
        System.out.println("\nDivided by 3 & 5");
        for (int i =1; i <= 100; i++)
        {
            if(i % 3 == 0 && i % 5 == 0)
                System.out.print(i + ", ");
        }

        // Q51. convert a string to an integer
        System.out.println("Q51. convert a string to an integer");
        System.out.print("Input number: ");
        String number51 = in.nextLine();
        System.out.println("Converted To Integer "+ Integer.parseInt(number51) );
        
        // Q52. calculate the sum of two integers and return true if the sum is equal to a third integer
        System.out.println("Q52. calculate the sum of two integers and return true if the sum is equal to a third integer");
        System.out.print("Enter First Number: ");
        int firstNumber52 = in.nextInt();
        System.out.print("Enter Second Number: ");
        int secondNumber52 = in.nextInt();
        System.out.print("Enter Third Number: ");
        int thirdNumber52 = in.nextInt();
        System.out.println("The Result is: " + sumoftwo(firstNumber52, secondNumber52, thirdNumber52));
        
        /* Q53 accepts three integers from the user and return true if 
           the second number is greater than first number and 
           third number is greater than second number.
           If "abc" is true second number does not need to be greater than first number
        */
        System.out.print("Q53\nEnter First Number: ");
        int firstNumber53 = in.nextInt();
        System.out.print("Enter Second Number: ");
        int secondNumber53 = in.nextInt();
        System.out.print("Enter Third Number: ");
        int thirdNumber53 = in.nextInt();
        System.out.println("The Result is: " + abc(firstNumber53, secondNumber53, thirdNumber53, true));
    
        /* Q54  accepts three integers from the user
           return true if two or more of them (integers ) 
           have the same rightmost digit.
           The integers are non-negative.
        */
         System.out.print("Q54\nEnter First Number: ");
        int firstNumber54 = in.nextInt();
        System.out.print("Enter Second Number: ");
        int secondNumber54 = in.nextInt();
        System.out.print("Enter Third Number: ");
        int thirdNumber54 = in.nextInt();
        System.out.println("The Result is: " + test_last_digit(firstNumber54, secondNumber54, thirdNumber54, true));
    
    }
    
    // Q 52
    public static boolean sumoftwo(int p, int q, int r)
        {	
            return ((p + q) == r || (q + r) == p || (r + p) == q);	
        }
    
    // Q 53
     public static boolean abc(int p, int q, int r, boolean xyz)
     {
        if(xyz){
            return (r > q);
        }
        return (q > p && r > q);
     }
     
     // Q54
     public static boolean test_last_digit(int p, int q, int r, boolean xyz)
     {
	return (p % 10 == q % 10) || (p % 10 == r % 10) || (q % 10 == r % 10);
     }
     

}
