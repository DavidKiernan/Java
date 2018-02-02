/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package staff;

/**
 *
 * @author David
 */
public class Commission extends Hourly{
    private double totalSales;
    private double commRate;

    public Commission(String n, String ad, String ph, String rsi, double sal, double Rate) {
        super(n, ad, ph, rsi, sal);
        commRate = Rate;
        totalSales=0;
    }

    public void totalSales(double sales) {
        totalSales = sales;
    }

    @Override
    public double pay() {
        return (super.pay()+(totalSales*commRate));
    }

    @Override
    public String toString() {
        return  super.toString() + "\n totalSales: " + totalSales;

    }
}
