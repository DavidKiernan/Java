package staff;

public class Employee extends StaffMember {
    
    private String rsiNumber;
    private double salary;

    public Employee(String n, String ad, String ph,String rsi, double sal) {
        super(n, ad, ph);
        rsiNumber=rsi;
        salary=sal;
    }

    @Override
    public String toString() {
        return super.toString() + "\n rsiNumber:" + rsiNumber;
    }

    @Override
    public double pay() {
        return salary;
    }
}
