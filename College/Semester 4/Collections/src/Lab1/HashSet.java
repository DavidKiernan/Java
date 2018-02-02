package Lab1;

import java.util.Iterator;
import java.util.Set;

/**
 * Created by x00093830 on 22/04/2015.
 */
public class HashSet {
    public static void main(String[] args) {

        // define String array with an initializer list
        String[] colours = {"red", "red", "blue", "orange", "cyan", "indigo", "blue", "orange", "black", "pink", "green", "navy", "emerald"};

        // declare a new hashset collection. HashSet implements Set class
        Set<String> hs = new java.util.HashSet<String>();

        // add elements of colours array to hashset collection
        for (String x: colours){
            hs.add(x);
        }

        System.out.println("Number of unique Strings: " + hs.size() + "\n");

        // iterator to iterate through the hashset collection (no need to declare "set" first, because it's hashSET collection)
        Iterator iter = hs.iterator();

        while(iter.hasNext()){
            System.out.println(iter.next());
        }

//        print all elements of hashset array (eliminating duplicates)
//        for (String x: hs){
//            System.out.println(x);
//        }

    }
}
