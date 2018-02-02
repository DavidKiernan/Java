package engine;

/**
 *
 * @author David
 */
import java.util.Scanner;
public class Engine {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        double engineSize;
        System.out.println("Enter Engine Size: ");

        engineSize = input.nextDouble(); // user input of type double

        if (engineSize <= 1000)
        {
            System.out.println("Engine Cost: € 150");
        }
        else if(engineSize > 1000 && engineSize <= 1200) // engine greater than 1000 and less than or equal 1200
        {
            System.out.println("Engine Cost: € 175");
        }
        else if(engineSize > 1200 && engineSize <= 1400)
        {
            System.out.println("It cost € 200 ");
        }
        else if(engineSize > 1400 && engineSize <= 1600)
        {
            System.out.println("It cost € 250 ");
        }
        else if(engineSize > 1600 && engineSize <= 1800)
        {
            System.out.println("It cost € 300 ");
        }
        else if(engineSize > 1800 && engineSize <= 2000)
        {
            System.out.println("It cost € 350 ");
        }
        else
        {
            System.out.println("It cost € 500 ");
        }

    }
    
}
