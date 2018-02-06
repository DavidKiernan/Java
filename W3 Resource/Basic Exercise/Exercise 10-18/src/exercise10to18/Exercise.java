package exercise10to18;

import java.util.Scanner;

public class Exercise {

    private static final double radius = 7.5;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /*Q10. Write a Java program to compute a specified formula
          4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11))
        */
//        double pi = 4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11));
//        System.out.println(pi);
        
        //Q11. Write a Java program to print the area and perimeter of a circle
//        double perimeter = 2 * Math.PI* radius;
//        double area = Math.PI * radius * radius;
//        System.out.println("Perimeter: " + perimeter);
//        System.out.println("Area: " + area);
        
        //Q12. Write a Java program that takes three numbers as input to calculate and print the average of the numbers
        
//        System.out.println("Enter 1st Number: ");
//        int num1 = in.nextInt();
//        System.out.println("Enter 2nd Number: ");
//        int num2 = in.nextInt();
//        System.out.println("Enter 3rd Number: ");
//        int num3 = in.nextInt();
//        System.out.println("Average of Numbers: " + num1 + ", " + num2 + ", " + num3 + " is " + (num1+num2+num3) / 3 );
//        
        /*Q13. Write a Java program to print the area and perimeter of a rectangle
          Width = 5.5 Height = 8.5
          Area is 5.6 * 8.5 = 47.60
          Perimeter is 2 * (5.6 + 8.5) = 28.20
        */
//        final double WIDTH = 5.6;
//        final double HEIGHT = 8.5;
//        
//        double perimeter = 2*(HEIGHT + WIDTH);
//        double area = WIDTH * HEIGHT;
//        System.out.printf("Perimeter is: %.2f", perimeter);
//        System.out.printf("\nArea is: %.2f", area);
        
        //Q14. Write a Java program to print an American flag on the screen
//        System.out.println("* * * * * * ==================================");
//        System.out.println(" * * * * *  ==================================");
//        System.out.println("* * * * * * ==================================");
//        System.out.println(" * * * * *  ==================================");
//        System.out.println("* * * * * * ==================================");
//        System.out.println(" * * * * *  ==================================");
//        System.out.println("* * * * * * ==================================");
//        System.out.println(" * * * * *  ==================================");
//        System.out.println("* * * * * * ==================================");
//        System.out.println("==============================================");
//        System.out.println("==============================================");
//        System.out.println("==============================================");
//        System.out.println("==============================================");
//        System.out.println("==============================================");
//        System.out.println("==============================================");

        //Q15. Write a Java program to swap two variables
        
//        int a = 3, b = 6, temp;
//        System.out.println("Before Swap: " + a + ", " + b);
//        temp = a;
//        a = b;
//        b = temp;
//        System.out.println("After Swap: " + a + ", " + b);

        //Q16. Write a Java program to print a face
//        System.out.println(" +\"\"\"\"\"+ ");
//        System.out.println("[| o o |]");
//        System.out.println(" |  ^  | ");
//        System.out.println(" | '-' | ");
//        System.out.println(" +-----+ ");

        /*Q17. Write a Java program to add two binary numbers
            Input first binary number: 10 
            Input second binary number: 11
            Sum of two binary numbers: 101
        */
        
//        long binary1, binary2;
//        int i = 0, remainder = 0;
//        int[] sum = new int[20];
//
//        System.out.print("Input first binary number: ");
//        binary1 = in.nextLong();
//        System.out.print("Input second binary number: ");
//        binary2 = in.nextLong();
//
//        while (binary1 != 0 || binary2 != 0) // bin1 or bin2 not = zero
//        {
//         sum[i++] = (int)((binary1 % 10 + binary2 % 10 + remainder) % 2);
//         remainder = (int)((binary1 % 10 + binary2 % 10 + remainder) / 2);
//         binary1 = binary1 / 10;
//         binary2 = binary2 / 10;
//        }
//        if (remainder != 0) {
//         sum[i++] = remainder;
//        }
//        --i;
//        System.out.print("Sum of two binary numbers: ");
//        while (i >= 0) {
//         System.out.print(sum[i--]);
//        }
//         System.out.print("\n");
         
         /*Q18. Write a Java program to multiply two binary numbers. Go to the editor
            Input Data:
            Input the first binary number: 10 
            Input the second binary number: 11 
            Expected Output

            Product of two binary numbers: 110 
         */
        long binary1, binary2, multiply = 0;
        int digit, factor = 1;
        System.out.print("Input the first binary number: ");
        binary1 = in.nextLong();
        System.out.print("Input the second binary number: ");
        binary2 = in.nextLong();
        while (binary2 != 0)
        {
            digit = (int)(binary2 % 10);
            if (digit == 1) 
            {
               binary1 = binary1 * factor;
               multiply = binaryproduct((int) binary1, (int) multiply);
            } 
            else
            {
                binary1 = binary1 * factor;
            }
            binary2 = binary2 / 10;
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
