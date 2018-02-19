package exercise;

import java.io.File;
import java.nio.charset.*;
import java.util.Scanner;

public class Exercise {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Q37. Write a Java program to reverse a string
        System.out.print("Q37. Write a Java program to reverse a string\nInput a String: ");
        char[] letters = in.nextLine().toCharArray();
        System.out.print("Reverse String: ");

        for (int i = letters.length - 1; i >= 0; i--) {
            System.out.print(letters[i]);
        }
        System.out.print("\n");
        System.out.println("Q38. count the letters, spaces, numbers and other characters of an input string.");
        //Q38. count the letters, spaces, numbers and other characters of an input string.
        // Method Used at bottom
        String test = "Bill O Malley, Age: 25, Lives: 554, Some Town";
        count(test);

        // Q39. Write a Java program to create and display unique three-digit number using 1, 2, 3, 4. Also count how many three-digit numbers are there
        System.out.println("Q39. create and display unique three-digit number using 1, 2, 3, 4. Also count how many three-digit numbers are there");
        int amount = 0;
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                for (int k = 1; k <= 4; k++) {
                    if (k != i && k != j && i != j) {
                        amount++;
                        System.out.println(i + "" + j + "" + k);
                    }
                }
            }
        }
        System.out.println("Total number of the three-digit-number is " + amount);

        // Q40. List the available character sets in charset objects.
        System.out.println("Q40. List the available character sets in charset objects.\nList of available character sets: ");
        for (String str : Charset.availableCharsets().keySet()) {
            System.out.println(str);
        }

        // Q41. print the ascii value of a given character.
        int chr = 'Z';
        System.out.println("Q41. print the ascii value of a given character.\nThe ACSII value of is: " + chr);

        // Q42. input and display your password.
        System.out.println("Q42. input and display your password.\nEnter the password:");
        String password = in.nextLine();
        System.out.println("your password was: " + password);

        /*Q43. print the following string in a specific 

                 Twinkle, twinkle, little star,
                 How I wonder what you are! 
                         Up above the world so high,   		
                         Like a diamond in the sky. 
         Twinkle, twinkle, little star, 
                 How I wonder what you are
         */
        System.out.println("Q43.\nTwinkle, twinkle, little star, \n\tHow I wonder what you are! \n\t\tUp above the world so high, \n\t\tLike a diamond in the sky. \nTwinkle, twinkle, little star, \n\tHow I wonder what you are!\n\n");

        //Q44. that accepts an integer (n) and computes the value of n+nn+nnn.
        System.out.print("Q44. that accepts an integer (n) and computes the value of n+nn+nnn.\nEnter Number: ");
        int n = in.nextInt();
        System.out.printf("%d + %d%d + %d%d%d\n", n, n, n, n, n, n);

        //Q45 find the size of a specified file
        System.out.println("Q45 find the size of a specified file\ntest.txt : " + new File("test.txt").length() + " bytes");
    }

    // Q 38
    public static void count(String x) {
        char[] ch = x.toCharArray();
        int letter = 0;
        int space = 0;
        int num = 0;
        int other = 0;
        for (int i = 0; i < x.length(); i++) {
            if (Character.isLetter(ch[i])) {
                letter++;
            } else if (Character.isDigit(ch[i])) {
                num++;
            } else if (Character.isSpaceChar(ch[i])) {
                space++;
            } else {
                other++;
            }
        }
        System.out.println("The string is : Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33");
        System.out.println("letter: " + letter);
        System.out.println("space: " + space);
        System.out.println("number: " + num);
        System.out.println("other: " + other);
    }
}
