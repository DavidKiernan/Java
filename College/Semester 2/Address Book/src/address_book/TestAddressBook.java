
package address_book;

import java.util.Scanner;

/**
 *
 * @author David
 */
public class TestAddressBook {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        String name;
    
        AddressBook book1 = new AddressBook(15);

        book1.add("John Gamma","103 Seaview Road, Seattle");
        book1.add("Clements Bass","675 Bay View, San Francisco");
        book1.add("Rob Benett","106 11th Avenue, NYC");

        book1.print();
        System.out.println("");

        int index = book1.indexOf("Clements Bass");
        book1.modify(index, "679 Sea View, San Francisco");

        book1.print();
        System.out.println("");

        System.out.println("Enter the name of contact your looking for");
        name = in.nextLine();


        book1.search(name);
    }
    
}
