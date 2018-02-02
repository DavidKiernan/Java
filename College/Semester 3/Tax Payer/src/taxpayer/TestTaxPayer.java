package taxpayer;

import java.util.Scanner;

public class TestTaxPayer {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        TaxPayer[] taxPayer;
        int numberTP;

        System.out.println("Please enter the number of taxpayers");
        numberTP=in.nextInt();
        int rsi[]=new int[numberTP];
        taxPayer = new TaxPayer[numberTP];
        double grossIncome []=new double[numberTP];
        
        for(int i=0;i<numberTP; i++){
            System.out.println("Please enter the rsi number for tax payer:"+(i+1));
            rsi[i]=in.nextInt();
            System.out.println("Please enter the salary number for tax payer:"+(i+1));
            grossIncome[i]=in.nextDouble();

            taxPayer[i]=new TaxPayer(rsi[i],grossIncome[i]);

        }

        for(int i=0;i<numberTP; i++){
            System.out.println("RSI no = "+taxPayer[i].getRsiNumber());
            System.out.println("Gross Salary = €"+taxPayer[i].getGrossIncome());
        }
    }
    
}
