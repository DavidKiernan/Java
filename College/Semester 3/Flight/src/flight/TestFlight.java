package flight;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class TestFlight {
    public static void main(String[] args) {
        int capacity=0;
	int age=0;
	double duration=0;
	String name;
        int flights=2;
        ArrayList<Flight> fList = new ArrayList <Flight>();

	Scanner in = new Scanner(System.in);
	Random select = new Random();
	int numpassengers=0;
        boolean v1 = false;
        boolean v2 = false;
        boolean v3 = false;

        for (int i = 0; i < flights; i++) {
            numpassengers = 1 + select.nextInt(2);

            while(!v1) try {
                System.out.println("Enter the flight capacity for flight:" + (i + 1));
                capacity = in.nextInt();
                v1=true;
            }catch (InputMismatchException im){
                in.nextLine();
                System.out.println("Data Entry error - please re try");
            }

            while (!v2) try {
                System.out.println("Enter the duration for flight:" + (i + 1));
                duration = in.nextDouble();
                v2 = true;
            }catch (InputMismatchException im){
                in.nextLine();
                System.out.println("Data Entry error - please re try");
            }

            fList.add(new Flight(capacity, duration));
            System.out.println("Number Passengers:" +numpassengers);
            for (int j = 0; j < numpassengers; j++) {
                System.out.println("Enter the name for passenger:" + (j + 1));
                name = in.next();

                while(!v3) try {
                    System.out.println("Enter the age for passenger:" + (j + 1));
                    age = in.nextInt();
                    v3=true;
                }catch (InputMismatchException im){
                    in.nextLine();
                    System.out.println("Data Entry error - please re try");
                    v3=false;
                }


                Flight.Passenger p = fList.get(i).new Passenger(name, age);
                fList.get(i).fillList(p);
                v1=false;
                v2=false;
                v3=false;
            }
        }

        for (int i=0;i<fList.size();i++)
        {
            System.out.println("Passenger List for Flight Number"+(i+1));
            fList.get(i).printList();
            System.out.println("Number seats available:"+fList.get(i).checkAvailability());
            System.out.println(fList.get(i).calcOldestpassenger()+" on flight number:"+(i+1));
        }  
    }
    
}
