package Lab2;
import javax.swing.*;
import java.util.*;

/**
 * Created by David on 29/04/2015.
 * counting the number of times a number
 * has been entered into the program
 */
public class Exercise2 {
    public static void main(String[] args) {

        // class variables, references
        HashMap hm = new HashMap();
        Scanner in = new Scanner(System.in); // take input from the system
        int lcv = 0;

        // start
        System.out.println("Start entering numbers");

        while (lcv != -1) { // -1 is called "sentinel value", indicates end of input, breaks out of the loop

            try {
                // take user input
                lcv = in.nextInt();

                int counter = 0; // set up the counter
                if (hm.containsKey(lcv)) { // query the HashMap, if Key exists, get its counter
                    counter = (Integer) hm.get(lcv); // get the count (Value) of the Key. (cast object to an integer)
                }

                // loop breaker. This if statement is used as a check, otherwise -1 gets put into the hashmap
                if (lcv != -1) { // if Key is not -1, put it into the hashmap (it will end the program)
                    hm.put(lcv, counter + 1); // why is this showing a warning?
                }
            } catch (InputMismatchException nfe) {
                System.out.println("Use numbers only");
                in.nextLine(); // clear the buffer, otherwise whatever was put in with in.nextInt stays in and it keeps looping it over and over
            }
        }

        printHashMap(hm);
    }

    public static void printHashMap(HashMap hashMapIn){

        // can I loop through a hashmap ?

        Set set = hashMapIn.entrySet(); // ??? why is this needed
        Iterator itr = set.iterator();

        System.out.println(); // new line
        while(itr.hasNext()){
            Map.Entry mapEntry = (Map.Entry)itr.next(); // don't understand this at all
            System.out.println("Number " + mapEntry.getKey() + " has been entered " + mapEntry.getValue() + " times");
        }
    }
}
