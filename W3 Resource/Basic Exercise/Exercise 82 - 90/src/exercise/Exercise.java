package exercise;

import java.io.*;
import java.util.Scanner;
import java.util.Arrays;

public class Exercise {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Q82 find the largest element between first, last, and middle values from an array of integers
        int[] array_nums82 = {20, 30, 40, 50, 67};
	System.out.println("Q82\nOriginal Array: "+Arrays.toString(array_nums82)); 
	int max_val82 = array_nums82[0];
	if(max_val82 <= array_nums82[array_nums82.length-1])
		max_val82 = array_nums82[array_nums82.length-1];
	if(max_val82 <= array_nums82[array_nums82.length/2])
            max_val82 = array_nums82[array_nums82.length/2];
	System.out.println("Largest element between first, last, and middle values: "+max_val82);  
 
        // Q83  multiply corresponding elements of two arrays of integers
        String result83 = "";
        int[] left_array83 = {1, 3, -5, 4};
        int[] right_array83 = {1, 4, -5, -2};
        System.out.println("Q83\nArray1: "+Arrays.toString(left_array83));  
        System.out.println("Array2: "+Arrays.toString(right_array83)); 
        for (int i = 0; i < left_array83.length; i++) {
            int num1 = left_array83[i];
            int num2 = right_array83[i];
            result83 += Integer.toString(num1 * num2) + " "; 
        }
        System.out.println("Result: "+result83);
        
        //Q84 take the last three characters from a given string and add the three characters at both the front and back of the string. 
        //String length must be greater than three and more.
        String string184 = "Python";
        int slength84 = 3;
        if (slength84 > string184.length()) {
            slength84 = string184.length();
        }

        String subpart84 = string184.substring(string184.length()-3);
        System.out.println(subpart84 + string184 + subpart84);
    
        //Q85 check if a string starts with a specified word.
        System.out.println("Q85");
        String string185 = "Hello how are you?";
        System.out.println(string185.startsWith("Hello"));
        
        //Q86 tart with an integer n, divide n by 2 if n is even or multiply by 3 and add 1 if n is odd, repeat the process until n = 1.
        int ctr86 = 0;
        System.out.println("Q86\nEnter Number: ");
        int n86 = in.nextInt();
        while (n86 != 1) {
            System.out.println(n86);
            if (n86 % 2 == 0) {
                n86 = n86 / 2;
                ctr86 += 1;
            }
            else {
                n86 = (3 * n86 + 1) / 2;
                ctr86 += 1;
            }
        }
        System.out.println(ctr86);
        
        //Q87  read an integer and calculate the sum of its digits and write the number of each digit of the sum in English.
        BufferedReader br87 = new BufferedReader(new InputStreamReader(System.in));
	System.out.print("Q87\nEnter Number: ");
        try {
                int sum87 = 0;
                String str87 = br87.readLine();
                char[] numStr87 = str87.toCharArray();
                for (int i = 0; i < numStr87.length; i ++) {
                        sum87 += numStr87[i] - '0';
                }
                System.out.println("Original Number: "+str87);
                print_number87(sum87);
        } catch (IOException e) {
                e.printStackTrace();
        }
        
        //Q88 get the current system environment and system properties
        System.out.println("Q88\nCurrent system environment:");
        System.out.println(System.getenv());	 
	System.out.println("\n\nCurrent system properties:");
        System.out.println(System.getProperties());
        
        //Q89 check whether a security manager has already been established for the current application or not
        System.out.println("Q89\nSystem security interface:");
        System.out.println(System.getSecurityManager());
        
        //Q90 get the value of the environment variable PATH, TEMP, USERNAME
        // gets the value of the specified environment variable "PATH"
      System.out.println("Q90\nEnvironment variable PATH: ");
      System.out.println(System.getenv("PATH"));

      // gets the value of the specified environment variable "TEMP"
      System.out.println("\nEnvironment variable TEMP: ");
      System.out.println(System.getenv("TEMP"));

      // gets the value of the specified environment variable "USERNAME"
      System.out.println("\nEnvironment variable USERNAME: ");
      System.out.println(System.getenv("USERNAME"));
    }
   
    //Q87
    public static void print_number87(int n) {
        int x; int y; int z;
        String[] number = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        System.out.println("Sum of the digits of the said number: "+n);
        if (n < 10) {
            System.out.println(number[n]);
        }
        else if (n < 100) {
            x = n / 10;
            y = n - x *10;
            System.out.println("In English: "+number[x] + " " + number[y]);
        }
        else {
            x = n / 100;
            y = (n - x * 100) / 10;
            z = n - x * 100 - y * 10;
            System.out.println("In English: "+number[x] + " " + number[y] + " " + number[z]);
        }
		
	}
}
