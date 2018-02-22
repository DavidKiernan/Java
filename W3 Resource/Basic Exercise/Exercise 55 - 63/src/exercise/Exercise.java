package exercise;

import java.util.Scanner;

public class Exercise {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        // Q55. convert seconds to hour, minute and seconds.
        System.out.print("Q55. convert seconds to hour, minute and seconds.\nInput seconds: ");
        int seconds = in.nextInt();
        int time = seconds % 3600; // seconds in 1 hour
        System.out.format("%d:%02d:%02d%n", seconds / 3600, time / 60, time % 60);
    
        //Q56 Write a Java program to find the number of integers within the range of two specified numbers and that are divisible by another number
        System.out.println("Q56 Write a Java program to find the number of integers within the range of two specified numbers and that are divisible by another number");
        int x56 = 5, y56 = 20, p56 = 3;
        System.out.println(result56(x56, y56, p56));
       
        //Q57 accepts an integer and count the factors of the number
        System.out.println("Q57 accepts an integer and count the factors of the number");
        System.out.print("Input an integer: ");
        int num57 = in.nextInt();
        System.out.println(result57(num57));
        
        //Q58. capitalize the first letter of each word in a sentence.
        System.out.print("Q58.Capitalize the first letter of each word in a sentence.\nInput a Sentence: ");
        String line58 = in.nextLine();
        String upper_case_line = ""; 
        Scanner lineScan = new Scanner(line58); 
        while(lineScan.hasNext()) {
            String word = lineScan.next(); 
            upper_case_line += Character.toUpperCase(word.charAt(0)) + word.substring(1) + " "; 
        }
        System.out.println(upper_case_line.trim()); 
        
        //Q59 Convert a given string into lowercase.
        System.out.print("Q59 Convert a given string into lowercase.\nInput a Sentence: ");
        String line59 = in.nextLine();
        System.out.println(line59.toLowerCase());
        
        //Q60  find the penultimate (next to last) word of a sentence.
        System.out.print("Q60 find the penultimate (next to last) word of a sentence\nInput a Sentence: ");
        String line60 = in.nextLine();
        String[] words = line60.split("[ ]+"); // seperates each word 
	System.out.println("Penultimate word: "+words[words.length - 2]);
	 
        //Q61  reverse a word.
        System.out.print("Q61 Reverse a word.\nInput a Word: ");
        char [] line61 = in.nextLine().toCharArray();
        for (int i = line61.length - 1; i>= 0; i--)
        {
            System.out.print(line61[i]);
        }
        
        // Q62 accepts three integer values and return true if one of them is 20 or more less than one of the others
        System.out.println("Q62 accepts three integer values and return true if one of them is 20 or more less than one of the others");
        System.out.print("Input the first number : ");
        int x62 = in.nextInt();  
        System.out.print("Input the second number: ");
        int y62 = in.nextInt(); 
        System.out.print("Input the third number : ");
        int z62 = in.nextInt(); 
        System.out.println((Math.abs(x62 - y62) >= 20 || Math.abs(y62 - z62) >= 20 || Math.abs(z62 - x62) >= 20));
   
        //Q63 that accepts two integer values from the user and return the larger values
        //However if the two values are the same, return 0 and return the smaller value if the two values have the same remainder when divided by 6.
        System.out.print("Q63.\nInput the first number : ");
        int a63 = in.nextInt();  
        System.out.print("Input the second number: ");
        int b63 = in.nextInt(); 
        System.out.println("Result: "+result63(a63, b63));
    }
    // Q56 
    public static int result56(int x, int y, int p) {	
        if (x%p == 0)
            return( y/p - x/p + 1);
        return(y/p - x/p);
    }
    
    // Q57
    public static int result57(int num) {	
        int ctr = 0;
        for(int i=1; i<=(int)Math.sqrt(num); i++) {
            if(num%i==0 && i*i!=num) {
                ctr+=2;
            } else if (i*i==num) {
                ctr++;
            }
        }
        return ctr;
    }
    
    //Q63
    public static int result63(int x, int y)
     {  
	if(x == y)
            return 0;
        if(x % 6 == y % 6)
            return (x < y) ? x : y;
        return (x > y) ? x : y;
     }
}
