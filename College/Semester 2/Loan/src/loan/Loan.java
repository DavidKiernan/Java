/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loan;

/**
 *
 * @author David
 */
public class Loan {
    private final int MONTHS_IN_YEAR=12;
    private double loanAmount;
    private double monthlyInterestRate;

    private int numberOfPayments;


    //constructor method

    Loan(double amount, double rate, int year){

      loanAmount=amount;
      monthlyInterestRate = (rate/100)/12;
      numberOfPayments =  year * MONTHS_IN_YEAR;

    }

    //Getter Methods

    public double loanAmount(){
      return loanAmount;
    }

    public int numberOfPayments(){
      return numberOfPayments;
    }

    public double getRate(){
      return monthlyInterestRate*12*100;
    }

    //Setter Methods

    public void setRate(double newRate){
      this.monthlyInterestRate=newRate;
    }

    public double getMonthlyPayment(){
     return (loanAmount * monthlyInterestRate) / ( 1 -  Math.pow(1 /( 1 + monthlyInterestRate), numberOfPayments));

    }



    //Print Method

    public void print(){
      System.out.printf("Loan Amount           : %,.2f\n " , loanAmount);
      System.out.printf("Annual Interest Rate   : %,.2f\n" ,(monthlyInterestRate*MONTHS_IN_YEAR*100));
      System.out.println("Loan Period In Years : " + (numberOfPayments/MONTHS_IN_YEAR));

    }
}
