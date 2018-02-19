package exercise10to18;

import java.util.Scanner;

public class Exercise {

    private static final double RADIUS = 7.5;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /*Q10. Write a Java program to compute a specified formula
          4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11))
        */
        double pi = 4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11));
        System.out.println("Q10 program to compute a specified formula\n" + pi);
        
        //Q11. Write a Java program to print the area and perimeter of a circle
        double perimeter = 2 * Math.PI* RADIUS;
        double area = Math.PI * RADIUS * RADIUS;
        System.out.println("Q11.print the area and perimeter of a circle\nPerimeter: " + perimeter);
        System.out.println("Area: " + area);
        
        //Q12. Write a Java program that takes three numbers as input to calculate and print the average of the numbers
        
        System.out.print("Q12.takes three numbers as input to calculate and print the average of the numbers\nEnter 1st Number: ");
        int num1 = in.nextInt();
        System.out.print("Enter 2nd Number: ");
        int num2 = in.nextInt();
        System.out.print("Enter 3rd Number: ");
        int num3 = in.nextInt();
        System.out.print("Average of Numbers: " + num1 + ", " + num2 + ", " + num3 + " is " + (num1+num2+num3) / 3 );
        
        /*Q13. Write a Java program to print the area and perimeter of a rectangle
          Width = 5.5 Height = 8.5
          Area is 5.6 * 8.5 = 47.60
          Perimeter is 2 * (5.6 + 8.5) = 28.20
        */
        final double WIDTH = 5.6;
        final double HEIGHT = 8.5;
        
        double perimeter1 = 2*(HEIGHT + WIDTH);
        double area1 = WIDTH * HEIGHT;
        System.out.printf("Q13. print the area and perimeter of a rectangle\nPerimeter is: %.2f", perimeter1);
        System.out.printf("\nArea is: %.2f", area1);
        
        //Q14. Write a Java program to print an American flag on the screen
        System.out.println("Q14. program to print an American flag on the screen\n");
        System.out.println("* * * * * * ==================================");
        System.out.println(" * * * * *  ==================================");
        System.out.println("* * * * * * ==================================");
        System.out.println(" * * * * *  ==================================");
        System.out.println("* * * * * * ==================================");
        System.out.println(" * * * * *  ==================================");
        System.out.println("* * * * * * ==================================");
        System.out.println(" * * * * *  ==================================");
        System.out.println("* * * * * * ==================================");
        System.out.println("==============================================");
        System.out.println("==============================================");
        System.out.println("==============================================");
        System.out.println("==============================================");
        System.out.println("==============================================");
        System.out.println("==============================================");

        //Q15. Write a Java program to swap two variables
        
        int a = 3, b = 6, temp;
        System.out.println("Q15 swap two variables\nBefore Swap: " + a + ", " + b);
        temp = a;
        a = b;
        b = temp;
        System.out.println("After Swap: " + a + ", " + b);

        //Q16. Write a Java program to print a face
        System.out.println("Q16 program to print a face ");
        System.out.println(" +\"\"\"\"\"+ ");
        System.out.println("[| o o |]");
        System.out.println(" |  ^  | ");
        System.out.println(" | '-' | ");
        System.out.println(" +-----+ ");

        /*Q17. Write a Java program to add two binary numbers
            Input first binary number: 10 
            Input second binary number: 11
            Sum of two binary numbers: 101
        */
        
        long binary1, binary2;
        int i = 0, remainder = 0;
        int[] sum = new int[20];

        System.out.println("Q17 add two binary numbers");
        System.out.print("Input first binary number: ");
        binary1 = in.nextLong();
        System.out.print("Input second binary number: ");
        binary2 = in.nextLong();

        while (binary1 != 0 || binary2 != 0) // bin1 or bin2 not = zero
        {
         sum[i++] = (int)((binary1 % 10 + binary2 % 10 + remainder) % 2);
         remainder = (int)((binary1 % 10 + binary2 % 10 + remainder) / 2);
         binary1 = binary1 / 10;
         binary2 = binary2 / 10;
        }
        if (remainder != 0) {
         sum[i++] = remainder;
        }
        --i;
        System.out.print("Sum of two binary numbers: ");
        while (i >= 0) {
         System.out.print(sum[i--]);
        }
         System.out.print("\n");
         
         /*Q18. Write a Java program to multiply two binary numbers.
            Input Data:
            Input the first binary number: 10 
            Input the second binary number: 11 
            Expected Output

            Product of two binary numbers: 110 
         */
        long binary18, binary28, multiply = 0;
        int digit, factor = 1;
        System.out.print("Q18 multiply two binary numbers\nInput the first binary number: ");
        binary18 = in.nextLong();
        System.out.print("Input the second binary number: ");
        binary28 = in.nextLong();
        while (binary28 != 0)
        {
            digit = (int)(binary28 % 10);
            if (digit == 1) 
            {
               binary18 = binary18 * factor;
               multiply = binaryproduct((int) binary18, (int) multiply);
            } 
            else
            {
                binary18 = binary18 * factor;
            }
            binary28 = binary28 / 10;
            factor = 10;
        }
        System.out.print("Product of two binary numbers: " + multiply+"\n");
    }
    static int binaryproduct(int binary1, int binary2) 
    {
        int i = 0, remainder = 0;
        int[] sum = new int[20];
        int binary_prod_result = 0;

        while (binary1 != 0 || binary2 != 0) 
        {
         sum[i++] = (binary1 % 10 + binary2 % 10 + remainder) % 2; // add bin1 and bin2 modded by 10 then mod ans by 2
         remainder = (binary1 % 10 + binary2 % 10 + remainder) / 2;
         binary1 = binary1 / 10;
         binary2 = binary2 / 10;
        }
        if (remainder != 0)
        {
         sum[i++] = remainder;
        }
        --i;
        while (i >= 0) 
        {
         binary_prod_result = binary_prod_result * 10 + sum[i--];
        }
        return binary_prod_result;
   }
}
