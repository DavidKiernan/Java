package employee;
public class InheritenceEmployee {
    public static void main(String[] args) {
       
        Employee emp1 = new Employee("John Smith", 90024, 30, 40);
        emp1.print();
        System.out.println("The salary is €" +emp1.calculateSalary());
        System.out.println("");


        Trainee train1 = new Trainee("Mary Jones", 97778, 15, 20, 10);
        train1.print();
        System.out.println("The total salary is €" +train1.calculateSalary());
    } 
}
