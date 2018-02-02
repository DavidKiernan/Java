package rectangle;

import java.util.Scanner;

/**
 *
 * @author David
 */
public class TestRectangle {
    public static void main(String args[]){
        
        Scanner in = new Scanner(System.in);
        double length;
        double width;
        
        Rectangle recTest = new Rectangle();
        Rectangle recTest2 = new Rectangle();

        //Length & Width of Rectangle 1//

        System.out.println("Enter The Length Of Rectangle 1");
        length=in.nextDouble();
        recTest.setLength(length);

        System.out.println("Enter The Width Of Rectangle 1");
        width=in.nextDouble();

        recTest.setWidth(width);

        System.out.println("Length Of Rectangle 1: " +recTest.getLength ());
        System.out.println(" Width Of Rectangle 1: " + recTest.getWidth() );

        System.out.println();

        System.out.println("Enter The Length Of Rectangle 2");
        length=in.nextDouble();

        recTest2.setLength(length);

        System.out.println("Enter The Width Of Rectangle 2");
        width=in.nextDouble();

        recTest2.setWidth(width);

        System.out.println("Length Of Rectangle 2: " +recTest2.getLength());
        System.out.println(" Width Of Rectangle 2: " + recTest2.getWidth() +"\n");
        
        if(recTest.getLength ()>recTest2.getLength ()){
            System.out.println("Rectangle 1 has the greater Length");
            recTest.print();
        }
        else{
            System.out.println("Rectangle 2 has the greater Length");
            recTest2.print();
        }
    
    }
}
