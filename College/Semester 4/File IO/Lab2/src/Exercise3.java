/**
 * Created by x00093830 on 11/03/2015.
 */
import java.util.Scanner;
import java.io.*;
public class Exercise3 {
    public static void main(String[] args) {
        File inFile = new File("files", "lyrics.txt");
        String text = "";

        try (FileWriter input = new FileWriter(inFile)) {
            //Input text
            input.write("If you like to gamble, I tell you I'm your man\n" +
                    "You win some, lose some, it's - all - the same to me\n" +
                    "The pleasure is to play, it makes no difference what you say\n" +
                    "I don't share your greed, the only card I need is\n" +
                    "The Ace Of Spades\n" +
                    "The Ace Of Spades\n");

        } catch (IOException e) {
            System.out.println(e);
        }
        try (Scanner in = new Scanner(inFile)) {
            //loops through till it receives a null value
            while (in.hasNext()) {
                text= in.nextLine();
                System.out.println(text);
            }
        } catch (IOException e) {
            System.out.println(e);
        }


    }
}
