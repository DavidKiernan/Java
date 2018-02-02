// 19 Oct 2014
package tax;
public class TestTax {
    public static void main(String[] args) {
        double amount=0.0;

        IPayable tp[] = {
                new Invoice("Printer", "01234", 375, 2),
                new Invoice("Ink Cartridges", "56789", 79.95, 4),
                new HourlyEmployee("John", "Smith", "6578431N", 60, 30),
                new HourlyEmployee("Lisa", "Kelly", "9865431M", 20, 12),
                new HourlyEmployee("Mary", "Reilly", "9875431M", 20, 8)
        };
        for(int i=0; i<tp.length;i++){

            if (tp[i] instanceof Invoice) {
                System.out.println(tp[i]);
                System.out.println("Amount Due: " + tp[i].getPaymentAmount());
            }
            else{
                    System.out.println(tp[i]);
                    System.out.println("WeeklySalary: " + tp[i].getPaymentAmount());

                }
            }
        System.out.println("");
        System.out.println("The total number of employees processed is " + HourlyEmployee.empCounter());
        System.out.println("The total number of employees processed is " + Invoice.inCount());
        System.out.printf("The total number of VAT paid is %.2f%n " , Invoice.vat());
        System.out.println("The total number of tax paid is " + HourlyEmployee.tax());
    }
    
}
