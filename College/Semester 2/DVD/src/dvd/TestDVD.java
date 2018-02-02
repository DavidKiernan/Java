package dvd;

/**
 *
 * @author David
 */
public class TestDVD {
    public static void main (String args[]){
    
        DVD dvd1=new DVD ("The Great Gatsby", "Classics", 1,5);
        DVD dvd2=new DVD ("The Hunger Games", "Fantasy", 3,3.50);

        dvd1.rent(3);
        dvd1.print();
        System.out.println("Cost Is : "  +dvd1.rent(3));
    }
}
