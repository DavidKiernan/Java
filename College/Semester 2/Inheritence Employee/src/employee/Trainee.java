/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;

/**
 *
 * @author David
 */
public class Trainee extends Employee{
    private int trainingHours;
  
    public Trainee(String empName, int numIn, int hourIn, double rate, int traineeHours) {
       super(empName, numIn, hourIn, rate); // calls the constructor in Employee 
       trainingHours = traineeHours;
    }

    @Override
    public double calculateSalary()
    {
      double total = super.calculateSalary();
      double trainPay = trainingHours * 5;
      total += trainPay;
      return total;
    }

    @Override
     public void print()
    {
       super.print();
       System.out.println("The trainee worked a total of " +trainingHours + " training hours earning €" +(trainingHours * 5));
    }
}
