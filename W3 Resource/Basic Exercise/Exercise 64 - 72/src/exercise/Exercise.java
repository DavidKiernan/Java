package exercise;

import java.util.Scanner;

public class Exercise {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Q64. accepts two integer values between 25 to 75 and return true if there is a common digit in both numbers
        System.out.print("Q64\nInput the first number: ");
        int a64 = in.nextInt();  
        System.out.print("Input the second number: ");
        int b64 = in.nextInt(); 
        System.out.println("Result: "+common_digit(a64, b64));
        
        //Q65 calculate the modules of two numbers without using any inbuilt modulus operator.
        System.out.print("Input the first number : ");
        int a65 = in.nextInt();  
        System.out.print("Input the second number: ");
        int b65 = in.nextInt(); 
        int divided65 = a65 / b65;
        int result65 = a65 - (divided65 * b65);
        System.out.println(result65);
        
        //Q66 compute the sum of the first 100 prime numbers.
        System.out.println("Q66 Compute sum of first 100 prime numbers");
        int sum66 = 1, controller66 = 0, number66 = 0;
        while (controller66 < 100){
            number66 ++;
            if (number66 % 2 != 0) {
                if (isPrime(number66)) {
                    sum66 += number66;
                    controller66++;
                }
            }
            
        }
        System.out.println("Sum of the first 100 prime numbers: "+sum66); 
        
        //Q67 insert a word in the middle of the another string
        String mainString67 = "Python 3.0";
        String word67 = "Tutorial";
        System.out.println("Q67Insert \"Tutorial\" in the middle of \"Python 3.0\", so result will be Python Tutorial 3.0\n"+ mainString67.substring(0, 7) + word67 + mainString67.substring(6));
	
        // Q68 create a new string of 4 copies of the last 3 characters of the original string. 
        // The length of the original string must be 3 and above.
        String main_string68 = "Python 3.0";
        String last_three_chars68 = main_string68.substring(main_string68.length() - 3);
        System.out.println("Q68\nFull String: "+main_string68+"\n"+last_three_chars68 + last_three_chars68 + last_three_chars68 + last_three_chars68);
 
        // Q69 extract the first half of a string of even length
        String main_string69 = "Python";    
        System.out.println("Q69\n Full Word: "+ main_string69+" Half word: " + main_string69.substring(0, main_string69.length()/2));	
  
        // Q70 Write a Java program to create a string in the form short_string + long_string + short_string from two strings.
        // The strings must not have the same length
        String str170 = "Python";    
	String str270 = "Tutorial"; 
	System.out.println("Q70");
	if(str170.length() >= str270.length())
            System.out.println( str270+str170+str270);
	else
            System.out.println(str170+str270+str170);
        
        // Q71 create the concatenation of the two strings except removing the first character of each string.
        // The length of the strings must be 1 and above
        String str171 = "Python";    
	String str271 = "Tutorial"; 
	System.out.println("Q71 \n" + str171.substring(1) + str271.substring(1));
	
        // Q72 create a new string taking first three characters from a given string
        // If the length of the given string is less than 3 use "#" as substitute characters
        String str172 = "";    
	int len72 = str172.length();
	if(len72 >= 3)
		System.out.println( str172.substring(0, 3));
	else if(len72 == 1)
		System.out.println( (str172.charAt(0)+"##"));
	else
		System.out.println("###");
    
    }
    
    //Q64
    public static boolean common_digit(int p, int q)
     {  
        if (p<25 || q>75)
            return false;
        int x = p % 10;
        int y = q % 10;
        p /= 10;
        q /= 10;
        return (p == q || p == y || x == q || x == y);
     }

    //Q66
    public static boolean isPrime(int n) {
        for (int i = 3; i * i <= n; i+= 2) {
            if (n % i == 0) {
                return false; 
            }
        }
        return true;
    }
}
