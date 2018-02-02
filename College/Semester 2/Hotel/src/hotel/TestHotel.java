package hotel;

/**
 *
 * @author David
 */
public class TestHotel {
    public static void main (String args[]){
        Hotel h1 = new Hotel("Hotel Marion", "Ballsbridge", 2001, 200, true);
        Hotel h2 = new Hotel("Hotel Lavery"," O Connell St", 1960, 90, false);

        h1.print();
        System.out.println("");
        h2.print();
        System.out.println("");

        double average;
        average = (h1.costInsurance() + h2.costInsurance()) /2; // Average price of Insurance
        System.out.println("The insurance for the first hotel is " +h1.costInsurance());
        System.out.println("The insurance for the second hotel is " +h2.costInsurance());
        System.out.println("Average insurance is " +average);
        System.out.println("");
        System.out.println("The Details Of The Hotel With The Highest Insurance Cost Is");

        if(h1.costInsurance()> h2.costInsurance()){
            h1.print();
        }
        else{
            h2.print();
        }
    }
}
