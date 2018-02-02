package student;

/**
 *
 * @author David
 */
public class Printcard {
    String accountNumber;
    String password;
    int numberCredits;


    //PRINT METHOD
    public void print () {
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Password Is : "+ password);
        System.out.println("Number Of Credits Is : "+numberCredits);
    }
  
    public String getAccountNumber() {
        return accountNumber;
    }
   
    public String getPassword() {
        return password;
    }
    public void setNumberCredits(int credits){
      this.numberCredits=credits;
    }
    
    public int getNumberCredits() {
        return numberCredits;
    }
}
