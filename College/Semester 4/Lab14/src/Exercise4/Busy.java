package Exercise4;

/**
 * Created by User on 27/03/2015.
 */

public class Busy implements Runnable {

    String name;

    public Busy(String n){
        name = n;
    }

    // must override this to implement Runnable
    public void run(){

        System.out.println("Busy Thread " + name + " Started");

        for(int i = 0; i < 10; i++){
            try{
                Thread.sleep(1000);
                System.out.println(name + " Is Busy " + (i+1));
            } catch (InterruptedException ie){
                System.out.println("Main Thread Woken Up");
                break;
            }
        }
        System.out.println("Busy Thread " + name + " Finished");
    }
}