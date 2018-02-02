package volume;

import java.util.Scanner;

/**
 * @author David
 * Volume Looping
 * User has the option of what they wish to calculate and can exit the process themselves
 */
public class Volume {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         Scanner in = new Scanner(System.in);

        double length = 0, height=0, r=0; // r is for the radius//
        double volume=0;
        int userChoice;

        System.out.println("--------Menu--------");
        System.out.println("1.\t Cube Volume");
        System.out.println("2.\t Cylinder Volume");
        System.out.println("3.\t Sphere Volume");
        System.out.println("4.\t Exit");

        System.out.println("\nEnter Choice");
        userChoice=in.nextInt();
        while(userChoice!=4){ // while the choice is not 4 it will stay inside the while loop

            if(userChoice==1){
                System.out.println("Enter your length");
                length=in.nextDouble();
                volume=length*length*length;
                System.out.println("The cube volume is " + volume); // print out the volume of the cube
            }
            else if(userChoice==2){
                System.out.println("Enter your radius");
                r=in.nextDouble();
                System.out.println("Enter your height");
                height=in.nextDouble();
                volume=Math.PI*r*r*height;
                System.out.println("The Cylinder volume is "+volume);
            }
            else if(userChoice==3){
                System.out.println("Enter your radius");
                r=in.nextDouble();
                volume= r*r*r*Math.PI* (4.0/3.0); // The formula
                System.out.println("The sphere volume is "+ volume);
            }
            else{
                System.out.println("Invalid Choice \nPlease Re-enter Number"); // any other number entered
            }

            System.out.println("--------Menu--------");
            System.out.println("1.\t Cube Volume");
            System.out.println("2.\t Cylinder Volume");
            System.out.println("3.\t Sphere Volume");
            System.out.println("4.\t Exit");

            System.out.println("\nEnter Choice");
            userChoice=in.nextInt();
        }
        System.out.println("Process Terminated");
    }
    
}
