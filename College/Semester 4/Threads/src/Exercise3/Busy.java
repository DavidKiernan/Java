package Exercise3;

/**
 * Created by David on 14/04/2015.
 */
public class Busy implements Runnable {
    public void run (){
        System.out.println("Busy Thread starts");

        for (int i =0; i<10;i++){
            System.out.println("Times "+ (i+1));
        }
        System.out.println("Busy has Finished");
    }
}
