package motherboard;

import java.util.Scanner;

public class TestMotherBoard {
    public static void main(String[] args) {
        
        Scanner in =new Scanner(System.in);
        String name;
        int totalMem;
        int capacity;

        System.out.println("Enter manufacturer: ");
        name=(in.next());
        System.out.println("enter memory size");
        totalMem=(in.nextInt());
        System.out.println("Enter number of memory modules");
        capacity=in.nextInt();

        MotherBoard m = new MotherBoard(name,totalMem,capacity);
        System.out.println(m.toString());
    }
    
}
