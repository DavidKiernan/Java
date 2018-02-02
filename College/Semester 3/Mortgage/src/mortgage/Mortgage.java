package mortgage;

public class Mortgage {
    private int ID;
    private double interest;
    private  int year;
    private double loan;

    // Constructor
    public Mortgage(int Id, double i, int y, double l)
    {
        ID = Id;
        interest = i/1200.0;
        year = y;
        loan = l;
    }

    // Find monthly pay
    public double monthlyPay()
    {
        return loan*interest/(1-(Math.pow(1/(1+interest),year*12)));
    }
    // Find total pay
    public double totalPay()
    {
        return monthlyPay()*year*12;
    }
}
