package tax;
public interface IPayable {
    double LOWRATE=0.23;
    double HIGHRATE=0.42;
    double VATRATE=0.235;

    public double getPaymentAmount();
}
