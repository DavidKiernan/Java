// 10 Oct 2014
package rockband;

import java.util.Scanner;

public class TestRockBand {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        String [] instr ={"Keyboards","Guitar","Guitar","Drums"};
        String [] name = {"John","Paul","George","Ringo"};

        Rockband rb = new Rockband("The Beatles","Apple",name,instr);
        rb.print();
        System.out.println();
        System.out.println("Please enter label");
        rb.changeRecordLabel(in.next());
        rb.print();
    }
    
}
