/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise2;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author David
 */
public class Deposit {
    public static void main (String args[])
    {
        double balance = 100;
        double deposit;
        
        Scanner in = new Scanner(System.in);
        
        try
        {
        System.out.println("Please enter the amount you wish to deposit ");
        deposit = in.nextDouble();
        
        balance = balance + deposit;
        
        System.out.println("New balance = " + balance);
        }
        
        catch(InputMismatchException e)
        {
            System.out.println("Invalid entry ");
            e.printStackTrace();
        }
    }
}
