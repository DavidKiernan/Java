package Exercise2;

/**
 * Created by x00093830 on 25/03/2015.
 */
public class Exercise2Busy implements Runnable {
    public void run() {
        System.out.println("Busy will start");
        for (int i = 0; i < 10; i++) {
            try{
                Thread.currentThread();
                Thread.sleep(10);
                System.out.println("Times: "+(i+1));
            }catch (InterruptedException e){
                System.out.println("Main Thread Woken Up");
                break;
            }
        }
        System.out.println("Busy will end");
    }
}
