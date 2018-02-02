package Exercise1;

/**
 * Created by User on 27/03/2015.
 */
public class Test {
    public static void main(String[] args){

        Thread bee = new Thread(new Busy());

        bee.start();

        System.out.println("Main Thread Started");
        System.out.println("Main Thread Finished");
    }
}
