
package exercise;

import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
      
        Scanner in = new Scanner(System.in);
        //Q19. convert a decimal number to binary 
        int dec_num, quot, i = 1, j;
        int bin_num[] = new int[100];

        System.out.print("Q19 convert a decimal number to binary \nInput a Decimal Number : ");
        dec_num = in.nextInt();

        quot = dec_num;

        while (quot != 0) {
            bin_num[i++] = quot % 2;
            quot = quot / 2;
        }

        System.out.print("Binary number is: ");
        for (j = i - 1; j > 0; j--) {
            System.out.print(bin_num[j]);
        }
        System.out.print("\n");

        // Using the method given
        System.out.println("Enter number to convert to binary: ");
        int num = in.nextInt();
        System.out.println(Integer.toBinaryString(num));

        //Q20. convert a decimal number to hexadecimal number
        int decNum, remainer;
        String hexDex = "";

        // Hexadecimal number digits
        char hex[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

        System.out.print("Q20 convert a decimal number to hexadecimal number\nInput Number: ");
        decNum = in.nextInt();

        // loping through 
        while (decNum > 0) {
            remainer = decNum % 16;
            hexDex = hex[remainer] + hexDex;
            decNum = decNum / 16;
        }
        System.out.println("Hexadecimal number is :" + hexDex);

        // Using method, given number in lower case
        System.out.print("Input Number: ");
        int num2 = in.nextInt();
        System.out.println(Integer.toHexString(num2));

        //Q21. Write a Java program to convert a decimal number to octal
        int num21, methodNum21;
        int octNum21[] = new int[100];
        System.out.print("Q21 convert a decimal number to octal\nEnter Number: ");
        num21 = in.nextInt();
        methodNum21 = num21;
        // loping 
        while (num21 != 0) {
            octNum21[i++] = num21 % 8;
            num21 = num21 / 8;
        }
        System.out.print("Octal Number Is: ");
        for (int a = i - 1; a > 0; a--) {
            System.out.print(octNum21[a]);
        }
        System.out.println("\nMethod: " + Integer.toOctalString(methodNum21));

        // Q22. Write a Java program to convert a binary number to decimal number
        long binaryNumber2, decimal2 = 0, remain2, j2 = 1;
        System.out.print("Q22 binary number to decimal number\nInput Binary Number: ");
        binaryNumber2 = in.nextLong();
        while (binaryNumber2 != 0) {
            remain2 = binaryNumber2 % 10;
            decimal2 = decimal2 + remain2 * j2;
            j2 *= 2;
            binaryNumber2 = binaryNumber2 / 10;
        }
        System.out.println("Decimal Number: " + decimal2);

        // Q23. convert a binary number to hexadecimal number.
        int[] hex3 = new int[1000];
        int i3 = 1, j3 = 0, rem3, dec3 = 0, bin3;
        System.out.print("Q23 convert a binary number to hexadecimal number\nInput a Binary Number: ");
        bin3 = in.nextInt();
        while (bin3 > 0) {
            rem3 = bin3 % 2;
            dec3 = dec3 + rem3 * i3;
            i3 = i3 * 2;
            bin3 = bin3 / 10;
        }
        i3 = 0;
        while (dec3 != 0) {
            hex3[i3] = dec3 % 16;
            dec3 = dec3 / 16;
            i3++;
        }
        System.out.print("HexaDecimal value: ");
        for (j3 = i3 - 1; j3 >= 0; j3--) {
            if (hex3[j3] > 9) {
                System.out.print((char) (hex3[j3] + 55) + "\n");
            } else {
                System.out.print(hex3[j3] + "\n");
            }
        }

        // Q24. convert a binary number to a Octal number
        int binnum24, binnum124, rem24, decnum24 = 0, quot24, i24 = 1, j24;
        int octnum24[] = new int[100];
        System.out.print("Q24 binary number to a Octal number\nEnter Binary Number : ");
        binnum24 = in.nextInt();
        binnum124 = binnum24;

        while (binnum24 > 0) {
            rem24 = binnum24 % 10;
            decnum24 = decnum24 + rem24 * i24;
            //System.out.println(rem);
            i24 = i24 * 2;
            binnum24 = binnum24 / 10;
        }

        i24 = 1;
        quot24 = decnum24;

        while (quot24 > 0) {
            octnum24[i24++] = quot24 % 8;
            quot24 = quot24 / 8;
        }

        System.out.print("Equivalent Octal Value of " + binnum124 + " is :");
        for (j24 = i24 - 1; j24 > 0; j24--) {
            System.out.print(octnum24[j24]);
        }

        System.out.print("\n");

        // Q25. convert a octal number to a decimal number.
        long octal_num25, decimal_num25 = 0;
        int i25 = 0;
        System.out.print("Q25 convert a octal number to a decimal number\nInput any octal number: ");
        octal_num25 = in.nextLong();
        while (octal_num25 != 0) {
            decimal_num25 = (long) (decimal_num25 + (octal_num25 % 10) * Math.pow(8, i25++));
            octal_num25 = octal_num25 / 10;
        }
        System.out.print("Equivalent decimal number: " + decimal_num25 + "\n");

        // Q26. convert a octal number to a binary number
        int[] octal_numvalues26 = {0, 1, 10, 11, 100, 101, 110, 111};
        long octal_num26, tempoctal_num26, binary_num26, place26;
        int rem26;
        System.out.print("Q26 convert a octal number to a binary number\nInput any octal number: ");
        octal_num26 = in.nextLong();
        tempoctal_num26 = octal_num26;
        binary_num26 = 0;
        place26 = 1;
        while (tempoctal_num26 != 0) {
            rem26 = (int) (tempoctal_num26 % 10);
            binary_num26 = octal_numvalues26[rem26] * place26 + binary_num26;
            tempoctal_num26 /= 10;
            place26 *= 1000;
        }
        System.out.println("Equivalent binary number: " + binary_num26+"\n");
 
       // Q27. convert a octal number to a hexadecimal number. 
       // Does not work if rest is not commented out
//        String octal_num27, hex_num27;
//        int decnum27;
//
//        System.out.print("Q27 octal number to a hexadecimal number\nInput a octal number: ");
//        octal_num27 = in.nextLine();
//
//        decnum27 = Integer.parseInt(octal_num27, 8);
//        hex_num27 = Integer.toHexString(decnum27);
//
//        System.out.print("Equivalent hexadecimal number: " + hex_num27 + "\n");
    }   
}
