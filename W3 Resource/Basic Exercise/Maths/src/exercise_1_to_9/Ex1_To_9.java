/*
 * Available From https://www.w3resource.com/java-exercises/basic/index.php
 * Accessed on 5th Feb 2018
 */
package exercise_1_to_9;

import java.util.Scanner;

public class Ex1_To_9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // Needed for user input
        
        //Q1. Write a Java program to print 'Hello' on screen and then print your name on a separate line
        System.out.println("Hello \nDavid Kiernan");
        
        //Q2. Write a Java program to print the sum of two numbers. eg 74+36
        System.out.println("Adding: " + (74 + 36));
        
        //Q3. Write a Java program to divide two numbers and print on the screen. eg 50 / 3
        System.out.println("Division: " + (50 / 3));
        
        /*Q4. Write a Java program to print the result of the following operations.
           a. -5 + 8 * 6
           b. (55+9) % 9 
           c. 20 + -3*5 / 8 
           d. 5 + 15 / 3 * 2 - 8 % 3
        */ 
        
        System.out.println("A: " +( -5 + 8 * 6));
        System.out.println("B: " + (55+9)%9);
        System.out.println("C: " + (20 +(-3*5)/8));
        System.out.println("D: " + (5 + 15 / 3*2-8%3));
        
        //Q5. Write a Java program that takes two numbers as input and display the product of two numbers Eg 25 * 5
        System.out.println("Q5 \nInput First Number: ");
        int num1 = in.nextInt();
        System.out.println("Input Second Number");
        int num2 = in.nextInt();
        System.out.println(num1 + " x " + num2 + " = " + num1*num2);
        
        /*Q6. Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers 
           a. 125 + 24 = 149
           b. 125 - 24 = 101
           c. 125 x 24 = 3000
           d. 125 / 24 = 5
           e. 125 mod 24 = 5
        */
        System.out.println("Q6 \nInput First Number: ");
        int num3 = in.nextInt();
        System.out.println("Input Second Number");
        int num4 = in.nextInt();
        System.out.println("A: " + num3 + " + " + num4 + " = " + (num3+num4));
        System.out.println("B: " + num3 + " - " + num4 + " = " + (num3-num4));
        System.out.println("C: " + num3 + " x " + num4 + " = " + num3*num4);
        System.out.println("D: " + num3 + " / " + num4 + " = " + num3/num4);
        System.out.println("E: " + num3 + " mod " + num4 + " = " + num3%num4);
        
        //Q7. Write a Java program that takes a number as input and prints its multiplication table upto 10
        System.out.println("Q7 \nInput Number: ");
        int q7Num = in.nextInt();
        for(int i = 0; i < 10; i++) 
        {
            System.out.println(q7Num + " x " + (i+1) + " = " + (q7Num * (i+1) ));
        }
        
        /*Q8. Write a Java program to display the following pattern
            J    a   v     v  a                                                  
            J   a a   v   v  a a                                                 
         J  J  aaaaa   V V  aaaaa                                                
          JJ  a     a   V  a     a
        */
        
        System.out.println("   J    a   v     v  a ");
        System.out.println("   J   a a   v   v  a a");
        System.out.println("J  J  aaaaa   V V  aaaaa");
        System.out.println(" JJ  a     a   V  a     a");

        /*Q9. Write a Java program to compute the specified expressions and print the output
            ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5)) 
            Expected Output
            2.138888888888889
        */
        
        System.out.println(((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5)));
    }
    
}
