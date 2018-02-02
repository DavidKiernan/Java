package Exercise4;

/**
 * Created by David on 14/04/2015.
 */
public class BusyEx4 implements Runnable {
    String name;

    public BusyEx4(String name) {
        this.name = name;
    }

    // must override this to implement Runnable
    public void run(){

        System.out.println("Busy Thread " + name + " Started");

        for(int i = 0; i < 10; i++){
            try{
                System.out.println(name + " Is Busy " + (i+1));
                Thread.sleep(2000);
            } catch (InterruptedException ie){
                System.out.println("Main Thread Woken Up");
                break;
            }
        }
        System.out.println("Busy Thread " + name + " Finished");
    }
}
