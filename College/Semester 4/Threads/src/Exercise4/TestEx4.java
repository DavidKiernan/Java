package Exercise4;

/**
 * Created by David on 14/04/2015.
 */
public class TestEx4 {
    public static void main(String[] args) {
        // create two objects of type Thread with Busy class, as runnable
        Thread b1 = new Thread(new BusyEx4("Harry"));
        Thread b2 = new Thread(new BusyEx4("Sally"));

        // start (run) threads
        b1.start();
        b2.start();

        // wait for both threads to die, until finishing this thread
        try{
            b1.join();
            b2.join();
        } catch (InterruptedException ie){
            System.out.println("Join B1, B2");
        }

        // printouts for this thread
        System.out.println("Main Thread Started");
        System.out.println("Main Thread Finished");
    }
}
