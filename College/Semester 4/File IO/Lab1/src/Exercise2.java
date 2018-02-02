/**
 * Created by David on 08/03/2015.
 */
import java.io.*;
public class Exercise2 {
    public static void main(String[] args) throws IOException {
        String read;
        double sum=0,curVal,min=100,max=0,avg, number=0;
        File myDir = new File("files");
        File myFile = new File(myDir,"Data.txt");
        BufferedReader in = new BufferedReader(new FileReader(myFile));

        while ((read = in.readLine())!= null) {
            System.out.println(read);
            number ++;
            sum += Double.parseDouble(read);
            curVal = Double.parseDouble(read);
            if (curVal < min) {
                min = curVal;
            }
            if (curVal > max) {
                max = curVal;
            }
        }
        avg = sum / number;

        System.out.println("Total is: "+sum);
        System.out.println("Max is  "+max);
        System.out.println("Min is: "+min);
        System.out.println("Average is: "+avg);
        File dir = new File("files");
        File file = new File(dir,"results.txt");

        try(PrintWriter out= new PrintWriter(new BufferedWriter(new FileWriter(file)))){
            out.println("Total is: "+sum);
            out.println("Max is: "+max);
            out.println("Min is: "+min);
            out.println("Average is: "+avg);
        }
    }
}
