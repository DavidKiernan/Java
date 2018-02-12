
package exercise;

import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
      
        Scanner in = new Scanner(System.in);
        //Q19. convert a decimal number to binary 
//        int dec_num, rem, quot, i=1, j;
//        int bin_num[] = new int[100];
//        
//		
//        System.out.print("Input a Decimal Number : ");
//        dec_num = in.nextInt();
//		
//        quot = dec_num;
//		
//        while(quot != 0)
//        {
//            bin_num[i++] = quot%2;
//            quot = quot/2;
//        }
//		
//        System.out.print("Binary number is: ");
//        for(j=i-1; j>0; j--)
//        {
//            System.out.print(bin_num[j]);
//        }
//        System.out.print("\n");
//        
//        // Using the method given
//        System.out.println("Enter number to convert to binary: ");
//        int num = in.nextInt();
//        System.out.println(Integer.toBinaryString(num);
        
        //Q20. convert a decimal number to hexadecimal number
        
//        int decNum, remainer;
//        String hexDex="";
//        
//        // Hexadecimal number digits
//        char hex[] = {'0', '1','2','3', '4', '5', '6', '7', '8', '9','A','B','C','D','E','F'};
//        
//        System.out.print("Input Number: ");
//        decNum = in.nextInt();
//        
//        // loping through 
//        while(decNum > 0){
//            remainer = decNum % 16;
//            hexDex = hex[remainer] + hexDex;
//            decNum = decNum/16; 
//        }
//        System.out.println("Hexadecimal number is :"+hexDex);
//        
//        // Using method, given number in lower case
//        System.out.print("Input Number: ");
//        int num2 = in.nextInt();
//        System.out.println(Integer.toHexString(num2));
//        
        // Q21. Write a Java program to convert a decimal number to octal
//        int num,i = 1, methodNum;
//        int octNum[] = new int[100];
//        System.out.print("Enter Number: ");
//        num = in.nextInt();
//        methodNum = num;
//        // loping 
//        while (num != 0) {
//            octNum[i++] = num %8;
//            num = num/8;
//        }
//        System.out.print("Octal Number Is: ");
//        for(int j = i-1; j>0; j--)
//        {
//            System.out.print(octNum[j]);
//        }
//        System.out.println("\nMethod: " + Integer.toOctalString(methodNum));
        
        // Q22. Write a Java program to convert a binary number to decimal number
//        long binaryNumber, decimal = 0, remain, j = 1;
//        System.out.print("Input Binary Number: ");
//        binaryNumber = in.nextLong();
//        while(binaryNumber != 0){
//            remain = binaryNumber % 10;
//            decimal =  decimal + remain * j;
//            j *= 2;
//            binaryNumber = binaryNumber / 10;
//        }
//        System.out.println("Decimal Number: " + decimal);
        
        // Q23. convert a binary number to hexadecimal number.
//        int[] hex = new int[1000];
//        int i = 1, j = 0, rem, dec = 0, bin;
//        System.out.print("Input a Binary Number: ");
//        bin = in.nextInt();
//        while (bin > 0) {
//            rem = bin % 2;
//            dec = dec + rem * i;
//            i = i * 2;
//            bin = bin / 10;
//        }
//         i = 0;
//        while (dec != 0) {
//            hex[i] = dec % 16;
//            dec = dec / 16;
//            i++;
//        }
//        System.out.print("HexaDecimal value: ");
//        for (j = i - 1; j >= 0; j--)
//        {
//         if (hex[j] > 9) 
//         {
//            System.out.print((char)(hex[j] + 55)+"\n");
//         }else
//         {
//            System.out.print(hex[j]+"\n");
//         }
//        }
        
        // Q24. convert a binary number to a Octal number
//        int binnum, binnum1,rem, decnum=0, quot, i=1, j;
//        int octnum[] = new int[100];
//        System.out.print("Enter Binary Number : ");
//        binnum = in.nextInt();
//        binnum1=binnum;
//     
//        while(binnum > 0)
//          {
//            rem = binnum % 10;
//            decnum = decnum + rem*i;
//            //System.out.println(rem);
//            i = i*2;
//            binnum = binnum/10;
//          }   
//
//          i=1;
//          quot = decnum;
//
//          while(quot > 0)
//          {
//              octnum[i++] = quot % 8;
//              quot = quot / 8;
//          }
//
//          System.out.print("Equivalent Octal Value of " +binnum1+ " is :");
//          for(j=i-1; j>0; j--)
//          {
//              System.out.print(octnum[j]);
//          }
// 
//          System.out.print("\n");

        // Q25. convert a octal number to a decimal number.
//        long octal_num, decimal_num = 0;
//        int i = 0;
//        System.out.print("Input any octal number: ");
//       octal_num = in.nextLong();
//       while (octal_num != 0) 
//        {
//         decimal_num = (long)(decimal_num + (octal_num % 10) * Math.pow(8, i++));
//         octal_num = octal_num / 10;
//        }
//        System.out.print("Equivalent decimal number: " + decimal_num+"\n");

        // Q26. convert a octal number to a binary number
//        int[] octal_numvalues = {0, 1, 10, 11, 100, 101, 110, 111};
//        long octal_num, tempoctal_num, binary_num, place;
//        int rem;
//        System.out.print("Input any octal number: ");
//        octal_num = in.nextLong();
//        tempoctal_num = octal_num;
//        binary_num = 0;
//        place = 1;
//        while (tempoctal_num != 0)
//        {
//         rem = (int)(tempoctal_num % 10);
//         binary_num = octal_numvalues[rem] * place + binary_num;
//         tempoctal_num /= 10;
//         place *= 1000;
//        }
//        System.out.print("Equivalent binary number: " + binary_num+"\n");
// 
       // Q27. convert a octal number to a hexadecimal number. 
        String octal_num, hex_num;
        int decnum;

        System.out.print("Input a octal number : ");
        octal_num = in.nextLine();

        decnum = Integer.parseInt(octal_num, 8);
        hex_num = Integer.toHexString(decnum);

        System.out.print("Equivalent hexadecimal number: "+ hex_num+"\n");
    }   
}
