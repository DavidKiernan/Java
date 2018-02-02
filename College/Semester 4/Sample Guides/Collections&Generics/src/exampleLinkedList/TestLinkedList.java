package exampleLinkedList;

import java.util.*;

public class TestLinkedList {
    public static void main(String args[])
    {
        LinkedList<String> staff = new LinkedList<String>();
        staff.addFirst("Dick");
        staff.addLast("Harry");
        staff.addLast("Romeo");
        staff.addLast("Tom");

        ListIterator iterator = staff.listIterator(); // |DHRT
        iterator.next(); // D|HRT
        iterator.next(); // DH|RT
        // add more elements after second element
        iterator.add("Juliet"); // DHJ|RT
        iterator.add("Nina"); // DHJN|RT
        iterator.next(); // DHJNR|T

        // remove last traversed element
        iterator.remove(); // DHJN|T

        // print all elements
        iterator = staff.listIterator();
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());

        }
    }
}
