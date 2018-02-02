package employee;
public class SalesPerson extends Employee {
    
    private double sales [];

    public SalesPerson(){
        super();
    }

    public SalesPerson(String name,int years,double salary, int saleIn){
        super (name, years, salary);
        sales= new double [saleIn];
    }
    public void fillSales(int dayNumber, double amount){
        sales[dayNumber]= amount;
    }

    @Override
    public void report(){
        super.report();

        double totSales=0, min=sales[0], max= sales[0];
        int numDayNoSale=0;

        for (int i=0; i<sales.length; i++){
            if(sales[i]<min)
                min=sales[i];

            if(sales[i]>max)
                max=sales[i];

            if(sales[i]==0)
                numDayNoSale++;

            totSales+=sales[i];

        }

        System.out.println("Total Sales is: " + totSales);
        System.out.println("Max Sales: " + max);
        System.out.println("Min Sales: " + min);
        System.out.println("Number of day with no sale is: " + numDayNoSale);
    }
}
