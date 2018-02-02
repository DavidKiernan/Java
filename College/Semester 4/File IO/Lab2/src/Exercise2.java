/**
 * Created by x00093830 on 11/03/2015.
 */
import java.util.Scanner;
import java.io.*;
public class Exercise2 {
    public static void main(String[] args) {
        int sum = 0,num, avg, count = 0;
        int min = Integer.MAX_VALUE, max= Integer.MIN_VALUE;

        File inFile = new File("files", "Data.txt");
        File outFile = new File("files", "results.txt");

        try(Scanner in = new Scanner(inFile);
               BufferedWriter out= new BufferedWriter(new FileWriter(outFile))){
            while (in.hasNextInt()){
                num = in.nextInt();
                sum += num;
                count++;
                if(num < min)
                    min = num;
                if (num > max)
                    max = num;
            }
            avg = sum/count;
            out.append("The sum is: "+sum+"\n"+"The min is: "+min+"\n"+"The Max is: "+max+"\n"+"The Avg is: "+avg);

        }catch (IOException e) {
            System.out.println("Error message: " + e.getMessage());
        }
    }
}
