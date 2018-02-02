package bankaccount;
public class SavingsAccount extends BankAccount{     // isa
    private double interestRate;                // %

   // new methods 
   
    public SavingsAccount(double rate, double balance)
    {
     super(balance);
     System.out.println("\t\tConstructor in SavingsAccount called");
     interestRate = rate;
    }

    public void addInterest()
    {
       double interest = getBalance() * interestRate / 100;
       deposit(interest);
    }
        
    @Override
    public void print()         // override print() inherited from BankAccount
    {
        super.print();
        System.out.println("\t\tCalled print() in SavingsAccount after super class print() ");
        System.out.println("Interest Rate is " + interestRate);
    }
}
