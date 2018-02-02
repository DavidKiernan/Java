package Exercise2;

/**
 * Created by User on 27/03/2015.
 */

public class Busy implements Runnable {

    public void run(){

        System.out.println("Busy Thread Started");

        for(int i = 0; i < 10; i++){
            try{
                Thread.sleep(10);
                System.out.println("Busy " + (i+1));
            } catch (InterruptedException ie){
                System.out.println("Main Thread Woken Up");
                break;
            }
        }
        System.out.println("Busy Thread Finished");
    }
}