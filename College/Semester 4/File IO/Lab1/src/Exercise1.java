/**
 * Created by David on 08/03/2015.
 */
import java.io.*;
public class  Exercise1 {
    public static void main(String[] args) throws IOException {
        String read;
        double sum=0;
        File myDir = new File("files");
        File myFile = new File(myDir,"Numbers.txt");
        BufferedReader in = new BufferedReader(new FileReader(myFile));

        while ((read = in.readLine())!= null){
            System.out.println(read);
            sum+= Double.parseDouble(read);
        }
        System.out.println("Sum of the numbers is: "+sum);

    }
}
