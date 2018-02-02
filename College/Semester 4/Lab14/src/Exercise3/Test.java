package Exercise3;

/**
 * Created by User on 27/03/2015.
 */

public class Test {
    public static void main(String[] args){

        // create an object of type Thread with Busy (bee) class as runnable
        Thread bee = new Thread(new Busy());

        // run bee thread
        bee.start();
        // set max priority for bee
        bee.setPriority(Thread.MAX_PRIORITY);

        // wait for bee thread to die, until finishing this thread
        try{
            bee.join();
        } catch (InterruptedException ie){
            System.out.println("Joined Bee");
        }

        System.out.println("Main Thread Started");
        System.out.println("Main Thread Finished");
    }
}
