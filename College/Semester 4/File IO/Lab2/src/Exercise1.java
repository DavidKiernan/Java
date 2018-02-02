/**
 * Created by x00093830 on 11/03/2015.
 */
import java.util.Scanner;
import java.io.*;
public class Exercise1 {
    public static void main(String[] args) throws IOException{
        double sum = 0, num;

        File inFile = new File("files", "Numbers.txt");

        try(Scanner in = new Scanner(inFile);){

            while(in.hasNextDouble()){
                num = in.nextDouble();
                sum+= num;
            }
            System.out.println("The sum of numbers is: "+sum);

        } catch (IOException e) {
            System.out.println("Error message: " + e.getMessage());
        }

    }
}
