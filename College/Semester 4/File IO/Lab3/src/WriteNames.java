/**
 * Created by David on 13/03/2015.
 */
import java.io.*;
import java.util.Scanner;

public class WriteNames {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please select an option 1,2 or 3");
        int opt = in.nextInt();
        if(opt == 1)
        {
            runOne();
        }else if (opt == 2)
        {
            runTwo();
        }else if (opt == 3)
        {
            runThree();
        }else
        {
            System.out.println("Error, you must select between 1,2 or 3.");
        }
    }

    // STATIC readFile Method

    public static String [] readFile(){
        String[] name = new String[5];
        String s = null;
        int count =0;

        try(Scanner in = new Scanner( new FileReader("files/Names.txt"))){
            while (in.hasNextLine()){
                s = in.nextLine();
                name[count] = s;
                count ++;
            }


        }catch (IOException k) {
            System.out.println("Error "+ k);
        }
        return name;
    }

    //runOne Method
    public static void runOne(){
        String [] names = readFile();
        try(PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("files/optOne.txt")))){
            for (int i=0; i < names.length; i++){
                System.out.println(names[i]);
                out.println(names[i]);
            }

        }catch (IOException e) {
            System.out.println("Error in runOne: "+ e);

        }
    }
    //runTwo method
    public static void runTwo(){
        String [] names = readFile();
        try(PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("files/optTwo.txt")))){
            for (int i=0; i < names.length; i++){
                System.out.println(names[i]);
                out.println(names[i]);
                i++;
            }

        }catch (IOException e) {
            System.out.println("Error in runOne: "+ e);

        }
    }

    public static void runThree(){
        Scanner in = new Scanner(System.in);
        String [] name3 = new String[5];
        for (int i = 0; i<readFile().length; i++){
            name3[i] = readFile()[i];
        }
        System.out.println("Please enter the name: ");
        String name = "";
        name = in.nextLine();

        for (int i = 0; i<name3.length;i++){
            String n = name3[i];
            String str = name3[i];
            String criteria = " ";
            String [] strarr = str.split(criteria);

            for (int j = 0; j < strarr.length; j++){
                if(name.equals(strarr[j])|| name.equals(name3[i])){
                    try (PrintWriter out = new PrintWriter(
                            new BufferedWriter(
                                    new FileWriter("files/opt3.txt")))) {
                       out.println(n);
                        System.out.println(n);

                    } catch (IOException e) {

                    }
                }
            }

        }
    }

}




