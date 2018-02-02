// 19th Sept 2014
package account;
import java.util.Random;

public class Account {
    private double balance;
    private String name;
    private int number;
    private Random r = new Random();

    //Default constructor
    public Account(){
      balance = 0.0;
      name = "";
      number =0;
    }

    //Loaded constructor 1
    public Account(double balanceIn, String nameIn, int numIn){
      balance = balanceIn;
      name = nameIn;
      number = numIn;    
    }

    //Loaded constructor 2
    public Account(double balanceIn, String nameIn){
      balance = balanceIn;
      name = nameIn;
      number = r.nextInt(10000); 
    }

    //Loaded constructor 3
    public Account(String nameIn){
      balance = 0.0;
      name = nameIn;
      number = r.nextInt(10000);    
    }

    public void withdrawl(double withdrawl){
      if(withdrawl > balance){
        System.out.println("  You do not have enough funds to withdraw");
      }
      else{
        balance -= withdrawl;
        //System.out.println("  Your new balance is "+balance);
      }
    }

    public void withdrawl(double withdrawl, double fee){
      if(withdrawl > balance){
        System.out.println("  You do not have enough funds to withdraw");
      }
      else{
        balance = balance - (withdrawl + fee);
        //System.out.println("  Your new balance is "+balance);
      }
    }

    public void deposit(double depositIn){
      balance += depositIn;
    }

    public double getBalance(){
      return balance;
    }

    public void print(){
      System.out.println("  This Account belongs to "+name);
      System.out.println("");
      System.out.println("  The Account has "+balance+" Euro avalible");
      System.out.println("");
      System.out.println("  The Account Number is "+number);
      System.out.println("");
    }
}
