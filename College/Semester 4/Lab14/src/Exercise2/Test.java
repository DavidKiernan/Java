package Exercise2;

/**
 * Created by User on 27/03/2015.
 */
public class Test {
    public static void main(String[] args){

        Thread bee = new Thread(new Busy());

        bee.start();

        try{
            Thread.sleep(70);
        } catch (InterruptedException ie){
            System.out.println("Main Thread Awoken");
        }

        bee.interrupt();
        System.out.println("Main Thread Started");
        System.out.println("Main Thread Finished");
    }
}
