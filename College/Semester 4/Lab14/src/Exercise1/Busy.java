package Exercise1;

/**
 * Created by User on 27/03/2015.
 */

public class Busy implements Runnable {

    public void run(){

        System.out.println("Busy Thread Started");

        for(int i = 0; i < 10; i++){
            System.out.println("Busy " + (i+1));
        }
        System.out.println("Busy Thread Finished");
    }
}