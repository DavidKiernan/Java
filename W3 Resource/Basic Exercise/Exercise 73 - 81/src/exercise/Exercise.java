package exercise;

import java.util.Arrays;

public class Exercise {

    public static void main(String[] args) {
        //Q73 create a new string taking first and last characters from two given strings.
        //If the length of either string is 0 use "#" for missing character.
        String str173 = "Python"; 
	String str273 = ""; 
	int length273 = str273.length();
	String result = "";
	result += (str173.length() >= 1) ? str173.charAt(0) : '#';
	result += (length273 >= 1) ? str273.charAt(length273-1) : '#';
	System.out.println("Q73\n" + result);
        
        //Q74  test if 10 appears as either the first or last element of an array of integers.
        //The length of the array must be greater than or equal to 2
        int[] num_array74 = {10, -20, 0, 30, 40, 60, 10};
        System.out.println("Q74\n" + (num_array74[0] == 10 || num_array74[num_array74.length-1] == 10));	

        // Q75 test if the first and the last element of an array of integers are same.
        // The length of the array must be greater than or equal to 2
        int[] num_array75 = {50, -20, 0, 30, 40, 60, 10};
        System.out.print("Q75 first and the last element of an array of integers are same\n");
    	System.out.println (num_array75.length >= 1 && num_array75[0] ==  num_array75[num_array75.length-1]);
        
        //Q76 test if the first and the last element of two array of integers are same.
        int[] num_array176 = {50, -20, 0, 30, 40, 60, 12};
	int[] num_array276 = {50, 20, 10, 20, 30, 50, 11};
        System.out.println("Q76 test if the first and the last element of two array of integers are same.");
	System.out.println(num_array176[0] == num_array276[0] || num_array176[num_array176.length-1] == num_array276[num_array276.length-1]);
 
        //Q77 create a new array of length 2 from two arrays of integers with three elements and the new array will contain the first and last elements from the two arrays
        int[] array177 = {50, -20, 0};
	int[] array277 = {5, -50, 10};
	System.out.println("Q77\nArray1: "+Arrays.toString(array177)); 
	System.out.println("Array2: "+Arrays.toString(array277)); 
        int[] array_new77 = {array177[0], array277[2]};	
	System.out.println("New Array: "+Arrays.toString(array_new77)); 	 
 
        // Q78 test that a given array of integers of length 2 contains a 4 or a 7
        int[] array_nums78 = {5, 7};
	System.out.println("Q78\nOriginal Array: "+Arrays.toString(array_nums78)); 
	if(array_nums78[0] == 4 || array_nums78[0] == 7)
		System.out.println("True");
        else{
            System.out.println(array_nums78[1] == 4 || array_nums78[1] == 7);
        }

        //Q79 otate an array (length 3) of integers in left direction.
        int[] array_nums79 = {20, 30, 40};
	System.out.println("Q79\nOriginal Array: "+Arrays.toString(array_nums79)); 
	int[] new_array_nums79 = {array_nums79[1], array_nums79[2], array_nums79[0]};
	System.out.println("Rotated Array: "+Arrays.toString(new_array_nums79)); 	 
 
        //Q80 get the larger value between first and last element of an array (length 3) of integers
        int[] array_nums80 = {20, 30, 40};
	System.out.println("Q80\nOriginal Array: "+Arrays.toString(array_nums80)); 
	int max_val = array_nums80[0];
	if(array_nums80[2] >= max_val)
		max_val = array_nums80[2];
	System.out.println("Larger value between first and last element: "+max_val); 	 

        //Q81 swap the first and last elements of an array (length must be at least 1) and create a new array.
        int[] array_nums81 = {20, 30, 40};
	System.out.println("Q81\nOriginal Array: "+Arrays.toString(array_nums81)); 
	int x = array_nums81[0];
	array_nums81[0] = array_nums81[array_nums81.length-1];
	array_nums81[array_nums81.length-1] = x;
	System.out.println("New array after swaping the first and last elements: "+Arrays.toString(array_nums81));  
 
    }
   
}
