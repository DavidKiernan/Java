package exercise;

import java.util.Arrays;

public class Exercise {

    public static void main(String[] args) {
        // Q91 measure how long some code takes to execute in nanoseconds.
        System.out.print("Q91\n");
        long startTime91 = System.nanoTime(), estimatedTime91;
        // Sample Program to display first 10 numbers
        for(int i = 1; i <= 10; i++)
        {
            System.out.println(i);
        }
        estimatedTime91 = System.nanoTime() - startTime91;
        System.out.println("Estimated Time for 1 - 10 numbers is: " + estimatedTime91 + " Nanoseconds");
        
        // Q92 count the number of even and odd elements in a given array of integers
        int[] nums92 = {5, 7, 2, 4, 9};
	int ctr_even92 = 0, ctr_odd92 = 0;
	System.out.println("Q92\nOriginal Array: "+Arrays.toString(nums92)); 
	    
        for(int i = 0; i < nums92.length; i++) {
            if(nums92[i] % 2 == 0)
            {         
              ctr_even92++;
            }
            else
               ctr_odd92++;	
        }                 
        System.out.printf("\nNumber of even elements in the array: %d",ctr_even92);
	System.out.printf("\nNumber of odd elements in the array: %d",ctr_odd92);
	System.out.printf("\n");

        // Q93 test if an array of integers contains an element 10 next to 10 or an element 20 next to 20, but not both.
        int[] nums93 = {10, 10, 2, 4, 9};
        //int[] nums93 = {10, 10, 2, 4, 20, 20};  
	System.out.println("Original Array: "+Arrays.toString(nums93)); 
	    
        boolean found1010 = false;
        boolean found2020 = false;

        for(int i = 0; i < nums93.length - 1; i++) {
            if(nums93[i] == 10 && nums93[i+1] == 10)
                found1010 = true;

            if(nums93[i] == 20 && nums93[i+1] == 20)
                found2020 = true;
        }

        System.out.printf( String.valueOf(found1010 != found2020));	
        System.out.printf("\n");
            
        // Q94 rearrange all the elements of an given array of integers so that all the odd numbers come before all the even numbers.
        int[] array_nums94 = {1, 7, 8, 5, 7, 13, 0, 2, 4, 9};
	  
	int i94 = 0;
        System.out.println("Q94\nOriginal Array: "+Arrays.toString(array_nums94)); 
        while(i94 < array_nums94.length && array_nums94[i94] % 2 == 0)
            i94++;

        for(int j = i94 + 1; j < array_nums94.length; j++) {
            if(array_nums94[j] % 2 != 0) {
                int temp94 = array_nums94[i94];
                array_nums94[i94] = array_nums94[j];
                array_nums94[j] = temp94;
                i94++;
            }
        }                                                    
  
	System.out.println("New Array: "+Arrays.toString(array_nums94)); 
 
        //Q95 create an array (length # 0) of string values. The elements will contain "0", "1", "2" … through ... n-1.
        int n95= 5;
	String[] arr_string95 = new String[n95];
        System.out.print("Q95\n");
        for(int i = 0; i < n95; i++){
            arr_string95[i] = String.valueOf(i);                                  
            System.out.println("New Array: "+Arrays.toString(arr_string95)); 
        } 
        
        //Q96 check if there is a 10 in a given array of integers with a 20 somewhere later in the array
        int[] array_nums96 = {10, 70, 80, 50, 20, 13, 50};
        boolean testd96 = false;
        int result96=0;
        int x96 = 10;
        int y96 = 20;
        System.out.println("Q96");
        for(int i = 0; i < array_nums96.length; i++) {
            if(array_nums96[i] == x96)
                testd96 = true;

            if(testd96 && array_nums96[i] == y96)
            {
             System.out.printf( String.valueOf(true));	
             result96 = 1;
            }
        }
         if (result96==0)                             
            {	 
                System.out.printf( String.valueOf(false));
            }
        System.out.printf("\n");
        
        // Q97 check if an array of integers contains a specified number next to each other or there are two same specified numbers separated by one element
        int[] array_nums97 = {10, 20, 10, 50, 20, 13, 50};
	//int[] array_nums97 = {10, 10, 50, 50, 20, 13, 50};
        int result97=0;
        int x97 = 10;
        System.out.println("Q97");

        for(int i = 0; i < array_nums97.length - 1; i++) {
            if(array_nums97[i] == x97 && array_nums97[i+1] == x97)
            {
                System.out.printf( String.valueOf(true));	
                result97 = 1 ;
            }

            if(i <= array_nums97.length - 3 && array_nums97[i] == x97 && array_nums97[i+2] == x97)
            {
                System.out.printf( String.valueOf(true));	
                result97 = 1;
            }
        }

        if (result97==0)                             
        {	 
            System.out.printf( String.valueOf(false));
        }
        System.out.printf("\n");
        
        //Q98 check if the value 20 appears three times and no 20's are next to each other in an given array of integers
        System.out.println("Q98");
        int[] array_nums98 = {10, 20, 10, 20, 40, 13, 20};
		
	int count98 = 0, result98 =0;
        
        if(array_nums98.length >= 1 && array_nums98[0] == 20)
            count98++;

        for(int i = 1; i < array_nums98.length; i++) {
            if(array_nums98[i - 1] == 20 && array_nums98[i] == 20)
            {
                System.out.printf( String.valueOf(false));	
                result98 = 1;
            }                   
            if(array_nums98[i] == 20)
                count98++;
        }

        if (result98==0)
            {
                System.out.printf( String.valueOf(count98 == 3));	         
            }	
        System.out.printf("\n");
        
        //Q99 check if a specified number appears in every pair of adjacent element of a given array of integers.
        System.out.println("Q99");
        int[] array_nums = {10, 20, 10, 20, 40, 20, 50};
	int result = 0;	
	int x = 20;
	for(int i = 0; i < array_nums.length - 1; i++) {
            if(array_nums[i] != x && array_nums[i + 1] != x)
            {
                result = 1;	
            }        
        }                                   
        if (result==0)
        {
            System.out.printf( String.valueOf(true));	         
        }
        else
        {
            System.out.printf( String.valueOf(false));	         
        }
        System.out.print("\n");
    }
    
}
