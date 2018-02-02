// 30 Sept 2014
package phonebook;

import java.util.Scanner;

public class PhoneBook {
    public static void main(String[] args) {
       
        Scanner in = new Scanner(System.in);

        int numberPh;

        System.out.println("Please enter the number of friends in your phone book");
        numberPh = in.nextInt();
        Friend ph[] = new Friend[numberPh];

        for (int i = 0; i < ph.length; i++) {

            ph[i] = new Friend();
            System.out.println("Please enter name");
            ph[i].setName(in.next());
            System.out.println("Please enter number");
            ph[i].setPhoneNumber(in.next());
        }

        System.out.println("\nPhone Book Details");
        for (int i = 0; i < ph.length; i++) {
            System.out.println(ph[i].toString());
        }

        int index = -1;
        while (index == -1) {
            System.out.println("Please enter name of contact you wish to update");
            String delName = in.next();

            for (int i = 0; i < ph.length; i++) {
                if (delName.equalsIgnoreCase(ph[i].getName())) {
                    index = i;
                    System.out.println("Please enter new number for " + ph[i].getName());
                    ph[index].setPhoneNumber(in.next());
                }
            }
            if (index == -1) {
                System.out.println("Name not found");
            }
            else{
                System.out.println("\nPhone Book Details");
                for (int i = 0; i < ph.length; i++) {
                    System.out.println(ph[i].toString());
                }
            }
        }
    }
    
}
