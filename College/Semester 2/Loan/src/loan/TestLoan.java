package loan;

/**
 *
 * @author David
 */
public class TestLoan {
    public static void main(String[] args){
      Loan loan1=new Loan(10000, 10, 10);
      Loan loan2=new Loan(15000, 7, 15);

      loan1.print();
      System.out.println();
      loan2.print();
    }
}
