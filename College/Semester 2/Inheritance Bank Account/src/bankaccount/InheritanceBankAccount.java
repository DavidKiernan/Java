package bankaccount;
public class InheritanceBankAccount {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SavingsAccount s = new SavingsAccount(10,100);        // 10%
        s.addInterest();
        s.print();
        s.withdraw(50);
        s.print();
        System.out.println("\n\n\n New Object");
        CurrentAccount c = new CurrentAccount(1500);
        c.deposit(400);
        c.print();
        c.deposit(600);
        c.print();
    }
    
}
