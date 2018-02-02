package event;
/**
 *
 * @author David
 */
import java.util.Scanner;
public class Event {

    public static void main(String[] args) {
        
         Scanner in = new Scanner(System.in);
        String corporate = "C. Larman", privateEvent = "Ken Bass";

        int code;
        System.out.println("Enter Code (1 for Corporate, 2 for Private Events)");
        code = in.nextInt();

        if (code == 1)
        {
            System.out.printf("Corporate Events: %.12s", corporate);
        }
        else if(code == 2)
        {
            // format the string to 8 places
            System.out.printf("Private Events: %.8s", privateEvent);
        }
    }
    
}
