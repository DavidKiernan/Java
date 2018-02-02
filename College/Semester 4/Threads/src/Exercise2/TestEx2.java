package Exercise2;

import Exercise1.Exercise1Busy;

/**
 * Created by x00093830 on 25/03/2015.
 */
public class TestEx2 {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new Exercise2Busy());
        thread1.start();
        System.out.println("This is main method");
        try{
            Thread.currentThread();
            Thread.sleep(70);
        } catch (InterruptedException e) {
        }
        thread1.interrupt();
        System.out.println("Main Thread Started");
        System.out.println("Main Thread Finished");
    }
}
