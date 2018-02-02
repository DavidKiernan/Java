package Exercise1;

/**
 * Created by x00093830 on 25/03/2015.
 */
public class Exercise1Busy extends Thread {
    public void run() {
        System.out.println("Busy will start");
        for (int i = 0; i < 10; i++) {
            System.out.println("Times: "+(i+1));
        }
        System.out.println("Busy will end");
    }
}



