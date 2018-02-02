import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by David on 12/03/2015.
 */
public class WriteStock {
    private final String FILENAME = "files/Stock.dat";
    //Stock stock[] = new Stock[3];

    private void write() {
        Stock stock[] = new Stock[4];
        stock[0] = new Stock("PS4", 1, 100);
        stock[1] = new Stock("Xbox", 2, 75);
        stock[2] = new Stock("The Godfather", 3, 10);
        stock[3] = new Stock("Clock", 4, 20);

        try (FileOutputStream fo = new FileOutputStream(FILENAME);
             ObjectOutputStream oo = new ObjectOutputStream(
                     new BufferedOutputStream(fo))) {
            for(int i=0; i<stock.length; i++){
                oo.writeObject(stock[i]);
                System.out.println("Stock Written: " + stock[i]);
            }
        } catch (NotSerializableException e) // doesn't implement serializable
        {
            System.out.println(e);
        } catch (IOException e) // file output error
        {
            System.out.println(e);
        }
    }
    private void read(){
        try (ObjectInputStream oi = new ObjectInputStream(
                new BufferedInputStream(new FileInputStream(FILENAME)))){
            Stock s [] = new Stock[4];
            for(int i=0; i<s.length;i++){
                s[i] = (Stock) oi.readObject();
                System.out.println("Stock Read: "+ s[i]);
            }

        }catch (IOException e) // file input error
        {
            System.out.println(e);
        } catch (ClassNotFoundException e) // class not found in this
        // application
        {
            System.out.println(e);
        }
    }

    public static void main(String args[]) {
        WriteStock ws = new WriteStock();
        ws.write();
        ws.read();
    }
}
