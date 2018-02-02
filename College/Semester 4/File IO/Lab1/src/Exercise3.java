/**
 * Created by David on 10/03/2015.
 */
import java.io.*;
public class Exercise3 {
    public static void main(String[] args) throws IOException {
        String text;

        //folder connection
        File folder = new File("files");
        //folder and file connection for writing to
        File textFile = new File(folder, "lyrics.txt");

        //Buffered space for text and setting up file writer into lyrics.txt file
        try (FileWriter input = new FileWriter(textFile)) {
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
        //Buffered space for text and setting up file reader from lyrics.txt file
        try (BufferedReader output = new BufferedReader(new FileReader(textFile))) {
            //loops through till it receives a null value
            while ((text = output.readLine()) != null) {
                System.out.println(text);
            }
        } catch (IOException e) {
            System.out.println(e);
        }

    }

}


