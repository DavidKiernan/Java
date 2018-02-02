// 24 Sept 2014
package order;

import java.util.Scanner;

public class TestOrder {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        Order testOrder=new Order("",0,0,0);
        ShippedOrder testSO=new ShippedOrder("",0,0,0); //TESTSO IS TEST FOR SHIPPED ORDER


        //TEST FOR THE TESTORDER
        System.out.println("Test Order");
        System.out.println("Please enter name ");
        testOrder.setCustName(in.nextLine());
        System.out.println("Please enter number ");
        testOrder.setCustNum(in.nextInt());
        System.out.println("Please enter quantity ");
        testOrder.setQuantityOrd(in.nextInt());
        System.out.println("Please enter unit price ");
        testOrder.setUnitPrice(in.nextDouble());
        testOrder.calTotalPrice();
        testOrder.print();

        //TEST FOR THE SHIPPEDORDER TESTSO
        System.out.println("Test Ship Order");
        in.nextLine();
        System.out.println("Please enter name ");
        testSO.setCustName(in.nextLine());
        System.out.println("Please enter number ");
        testSO.setCustNum(in.nextInt());
        System.out.println("Please enter quantity ");
        testSO.setQuantityOrd(in.nextInt());
        System.out.println("Please enter unit price ");
        testSO.setUnitPrice(in.nextDouble());
        testSO.calcTotalPrice();
        testSO.print();
    }
    
}
