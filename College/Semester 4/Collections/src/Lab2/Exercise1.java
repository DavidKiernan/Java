package Lab2;
import javax.swing.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;


/**
 * Created by David on 29/04/2015.
 * Taking names from a file with no repeat names
 */
public class Exercise1{



    // variables and imports
    Set<String> names;
    FileInputStream fis;
    Iterator itr;
    Scanner in;
    String result = ""; // have to initialize, otherwise null is printed with the iterator


    public String listNames(){

        // initialize FileInputStream, read the file
        try{
            fis = new FileInputStream(new File("files/names.txt"));
        } catch (FileNotFoundException fnf){
            JOptionPane.showMessageDialog(null,"File not found");
        }

        // initialize the scanner
        in = new Scanner(fis);

        // initialize the Set as a HashSet, read the file and add it to the HashSet
        names = new HashSet<String>();
        while (in.hasNextLine()){ // don't use hasNext, it'll only read one word at a time, i.e. Paul Brady = Paul, Brady, ... use hasNextLine to take the whole line (fist and last nameDeduper)
            names.add(in.nextLine());
        }

        itr = names.iterator();

        // iterate using while loop and print the contents of the iterator
        while (itr.hasNext()){
            result += (itr.next() + "\n");
        }
        return result.trim(); // trim the last "\n" - empty line
    }

//    back up to JUNIT
    public static void main(String[] args){

        Exercise1 n = new Exercise1();
        System.out.println(n.listNames());
    }
}
