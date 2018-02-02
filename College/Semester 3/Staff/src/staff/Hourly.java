package staff;

public class Hourly extends Employee{
    
    private double hours;

    public Hourly(String n, String ad, String ph, String rsi, double sal) {
        super(n, ad, ph, rsi, sal);
        hours =0;
    }

    public void addHours(double h) {
        hours = h;
    }


    @Override
    public double pay() {
        return super.pay()*hours;
    }

    @Override
    public String toString() {

        return super.toString() + "\n hours: " + hours ;
    }
}
