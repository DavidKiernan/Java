package staff;

public class Executive extends Employee{
    private double bonus;

    public Executive(String n, String ad, String ph, String rsi, double sal) {
        super(n, ad, ph, rsi, sal);
        bonus = 0;
    }

    public void awardBonus(double b) {
        bonus = b;
    }

    @Override
    public double pay() {
        return super.pay()+ bonus;
    }
}
