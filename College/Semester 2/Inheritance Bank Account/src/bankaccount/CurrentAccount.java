package bankaccount;

public class CurrentAccount extends BankAccount {
    private int transactionCount;
    
    public CurrentAccount(double initbal) {
     super(initbal);
     transactionCount = 0;
     System.out.println("\t\tIn currentAccount constructor");
        
    }
    
    public void deposit(double amount) 
    { 
     super.deposit(amount);//need to call super class's deposit method, to distinguish from this class's deposit() prefix with super.
     transactionCount++;
    }

    public void print(){
     System.out.println("Balance is " + balance);
     System.out.println("No of Transactions is " + transactionCount);
    } 
}
