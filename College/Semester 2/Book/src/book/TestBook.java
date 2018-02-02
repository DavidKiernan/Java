package book;

import java.util.Scanner;

/**
 *
 * @author David
 */
public class TestBook {
    public static void main(String[] args){
    
        Scanner in=new Scanner(System.in);
        Book book1= new Book("0000", "The Outsiders", "J.K.Rollin", "2nd Edition");
        Book book2= new Book("0001", "The Hunger Games", "G.R.R.Martin", "1st Edition");

        String editionIn;
        String isbnIn;
        String nameIn;
        String authorIn;

        book1.print();
        book2.print();

        System.out.println("Enter Edition Of "+book1.getName());
        editionIn = in.next();
        book1.setEdition(editionIn);

        book1.print(); 

        // Details Of Book3

        System.out.println("Enter The Title Of Book   : ");
        nameIn=in.next();


        System.out.println("Enter The Author Name     : ");
        authorIn=in.next();


        System.out.println("Enter The Edition Of Book : ");
        editionIn=in.next();


        System.out.println("Enter The ISBN Of Book    : ");
        isbnIn=in.next();


        Book book3= new Book(isbnIn, nameIn, authorIn, editionIn );

        book3.print();

    }
}
