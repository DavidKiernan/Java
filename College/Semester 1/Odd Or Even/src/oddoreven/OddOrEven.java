/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oddoreven;

import java.util.Scanner;

/**
 *
 * @author David
 */
public class OddOrEven {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int number;

        System.out.print("Enter a Whole Number (E.G. 3): ");
        number = input.nextInt();

        if (number % 2 == 0)
        {
            System.out.println(number + " is Even");
        }
        else
        {
            System.out.println(number + " is Odd");
        }
    }
    
}
