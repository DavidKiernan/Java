package addressbook;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class AddressBook {
    
    private String owner;
    private ArrayList <Contact> myList = new ArrayList<Contact>();
    private static int totalContacts=0;

    public AddressBook(String owner)
    {		
        this.owner = owner;
        fillList();
    }
	
    public void fillList()
    {
        Scanner in = new Scanner(System.in);
        Random select = new Random();
        int numContacts=0;
        numContacts = 1+select.nextInt(3);
        totalContacts+=numContacts;
        String name;
        String mobile;
        char gender;
        String schar;

        for (int i=0;i<numContacts;i++)
        {
                 System.out.print("Enter name for contact " +(i+1) + " ");
                 name = in.nextLine();
                 System.out.print("Enter gender for contact " +(i+1) + " ");
                 schar = in.nextLine();
                 gender = schar.charAt(0);
                 System.out.print("Enter mobile for contact " +(i+1) + " ");
                 mobile = in.nextLine();

                 myList.add(new Contact(name,gender,mobile));

        }
    }
    public void printList()
    {
        for (int i=0;i<myList.size();i++)
        {
            System.out.println(myList.get(i).name +","+ myList.get(i).gender +","+myList.get(i).mobile);
        }
    }
    public int calcNumMales()
    {
        int numMales=0;
        for (int i=0;i<myList.size();i++)
         {
            if (myList.get(i).gender=='m')
                numMales++;

         }
        return numMales;
    }

    public String getName()
    {
        return owner;
    }
    public static int getTotalContacts()
    {
        return totalContacts;
    }
	
    class Contact
    {
        private String name;
        private char gender;
        private String mobile;

        public Contact(String name,char gender, String mobile)
        {
            this.name = name;
            this.mobile = mobile;
            this.gender = gender;
        }		
    }
}
