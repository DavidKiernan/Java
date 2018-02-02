package whileexmple;

/**
 * @author David
 * The while loop is used more often
 * but depends on user preference
 * will print numbers 1-10
 */
public class WhileExmple {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         int x = 1, y = 1;
        while(x <= 10)
        {
            System.out.println("x is: " + x);
            x += 1; // this will add one to x, so can exit the loop
        }

        System.out.println("\nNow Doing a Do While Loop \n");

        do
        {
            System.out.println("Y is: " + y);
            y +=1; // += is short for y = y +1
        }
        while (y <= 10);
    }
    
}
