package staff;

public class Volunteer extends StaffMember{
    public Volunteer(String n, String ad, String ph){

        super(n,ad,ph);
    }

    @Override
    public double pay() {
        return 0;
    }
}
