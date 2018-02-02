package bankaccount;
public class BankAccount {
    protected double balance;      // not inherited

    // default constructor
    public BankAccount()
    { 
      System.out.println("\t\tConstructor in BankAccount called");
      balance = 0;
    }

      // constructor
    public BankAccount(double initialBalance)
    { 
        balance = initialBalance;
    }

      // methods

    public void deposit(double amount) 
    { 
        balance = balance + amount;
    }

    public void withdraw(double amount) 
    { 
        balance = balance - amount;
    }

      // get method
    public double getBalance()
    { 
        return balance; 
    }
    public void print(){
     System.out.println("Balance is " + balance);
    }
}
