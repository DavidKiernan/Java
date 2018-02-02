package taxpayer;
public class TaxPayer {
    
    private int rsiNumber;
    private double grossIncome;
    
    // Default constructor
    public TaxPayer(){
        rsiNumber = 0;
        grossIncome = 0.0;
    }

    public TaxPayer(int rsiNumber, double grossIncome) {
        this.rsiNumber = rsiNumber;
        this.grossIncome = grossIncome;
    }

    public int getRsiNumber() {
        return rsiNumber;
    }

    public void setRsiNumber(int rsiNumber) {
        this.rsiNumber = rsiNumber;
    }

    public double getGrossIncome() {
        return grossIncome;
    }

    public void setGrossIncome(double grossIncome) {
        this.grossIncome = grossIncome;
    }
    
    
}
