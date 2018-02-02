package addressbook;

import java.util.ArrayList;
import java.util.Scanner;

public class TestAddressBook {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        String name = null;
        int numBooks = 2;
        ArrayList <AddressBook> collection = new ArrayList<AddressBook>();
        for (int i=0;i<numBooks;i++)
        {
            System.out.println("Enter the owner of address book " + (i+1) +" ");
            name = in.nextLine();
            collection.add(new AddressBook(name));
        }

        for (int i=0;i<collection.size();i++)
        {
            System.out.println("Address Book belongs to: "+collection.get(i).getName());
            collection.get(i).printList();	
            System.out.println("Number of male friends are: "+collection.get(i).calcNumMales());
        }
        System.out.println("Total Contacts: "+AddressBook.getTotalContacts());
		
    }   
}
