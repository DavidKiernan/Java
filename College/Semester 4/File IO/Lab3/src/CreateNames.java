/**
 * Created by x00093830 on 13/03/2015.
 */
import java.io.*;
public class CreateNames {
    public static void main(String[] args) {
        final String FILENAME = "files/Names.txt";

        String names [] = new String[5];
        names[0]= "David Kiernan";
        names[1]= "Tom McKay";
        names[2]= "John Smith";
        names[3]= "James Bond";
        names[4]= "Richard Doyle";

        try(PrintWriter out= new PrintWriter(new BufferedWriter(new FileWriter(FILENAME)))){
            for (int i =0;i<names.length;i++){
                out.println(names[i]);
            }

        }catch (IOException e){

        }


    }
}
