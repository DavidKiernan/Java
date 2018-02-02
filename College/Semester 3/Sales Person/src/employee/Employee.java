// 30 Sept 2014.
package employee;
public class Employee {
    
    protected String name;
    protected int years;    // years is the years of service the employee has
    protected double salary;

    public Employee(){
        name="";
        years=0;
        salary=0;
    }

    public Employee(String nameIn,int yearsIn,double salaryIn){
        name=nameIn;
        years=yearsIn;
        salary=salaryIn;
    }

    public void report(){
        System.out.println("Employee:");
        System.out.println("\tName: "+name);
        System.out.println("\tYears Service: "+years);
        System.out.println("\tSalary: "+salary);
    }
}
