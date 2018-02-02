package Exercise1;

/**
 * Created by x00093830 on 25/03/2015.
 */

public class TestEx1{
    public static void main(String[] args) {
        Thread thread1 = new Thread(new Exercise1Busy(), "Object1");
        thread1.start();
    }
}
