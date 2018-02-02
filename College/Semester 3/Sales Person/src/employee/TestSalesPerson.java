package employee;

import java.util.Scanner;

public class TestSalesPerson {
    public static void main(String[] args) {
        
        Scanner in=new Scanner(System.in);

        SalesPerson s1=new SalesPerson("John Dixion",5,40000,5);

        double transaction;

        for(int i=0; i<5; i++){
            System.out.println("Enter the amount of sales transaction: "+ (i+1));
            transaction = in.nextDouble();
            s1.fillSales(i,transaction);
        }
        s1.report();
    }
    
}
