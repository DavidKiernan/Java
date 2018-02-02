package employee;
public class Employee {
    private String name;
    private int number;
    private int hoursWork;
    private double payRate;


    public Employee() // Default Constructor
    { 
      name = "";
      number = 0;
      hoursWork = 0;
      payRate = 0;
    }

    public Employee(String nameIn, int numberIn, int hoursIn, double rateIn) // Constructor
    { 
        name = nameIn;
        number = numberIn;
        hoursWork = hoursIn;
        payRate = rateIn;
    }

    public int getHoursWorked()
    {
        return hoursWork;
    }

    public double getWagesRate()
    {
        return payRate;
    }

    public double calculateSalary()
    {
        double salary = hoursWork * payRate;
        return salary;
    }

    public void print()
    {
        System.out.println("The name of the employee is " +name );
        System.out.println("The number of employee " +name + " is " +number );
        System.out.println("The hours worked by " +name + " was " +hoursWork );
        System.out.println("The pay rate for " +name + " is €" +payRate );
    }
}
