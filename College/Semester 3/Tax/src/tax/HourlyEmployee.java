package tax;
public class HourlyEmployee extends Employee implements IPayable{
    private int hours;
    private double hourlyPay;
    private static int empCounter;
    private static double tax;

    public HourlyEmployee(String f, String l, String r, int h, double hP) {
        super(f, l, r);
        hours = h;
        hourlyPay = hP;
        empCounter++;
    }


    public static int empCounter(){return empCounter ;}

    public static double tax(){return tax;}

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public double getHourlyPay() {
        return hourlyPay;
    }

    public void setHourlyPay(double hourlyPay) {
        this.hourlyPay = hourlyPay;
    }

    //@Override
   // public String toString() {
     //   super.toString();
      //  return ;
   // }


    @Override
    public double getPaymentAmount() {
        double wage= (hours * hourlyPay);
        double pay=0;
        if (wage < 200) {
            pay =wage;

        } else if (wage > 200 && wage < 300) {
            pay= wage - (wage * LOWRATE);
            tax += wage-(wage-(wage * LOWRATE));

        } else if(wage > 300){
            double lowRate=300-(300*LOWRATE);
            double higherRate=  wage -300;
            higherRate = higherRate-(higherRate*HIGHRATE);
            pay = lowRate+ higherRate;
            tax += wage -pay;

        }
        return pay;
    }
}
