package Exercise3;

/**
 * Created by David on 14/04/2015.
 */
public class Test {
    public static void main(String[] args) {
        // create an object of type Thread with Busy (busy) class as runnable
        Thread busy = new Thread(new Busy());

        // run the thread
        busy.start();
        busy.setPriority(Thread.MAX_PRIORITY);

        // wait for busy thread to die, until finish this thread

        try {
            busy.join();
        } catch (InterruptedException e) {
            System.out.println("Joined Busy");
        }
        System.out.println("Main Thread Started");
        System.out.println("Main Thread Finished");
    }
}
