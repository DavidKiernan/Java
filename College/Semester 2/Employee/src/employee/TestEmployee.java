/*
    Programe in which user will enter the details for 2 employees
    It will compare their salary and display the employee details of 
    The employee with the higher salary
*/
package employee;

import java.util.Scanner;

public class TestEmployee {
    public static void main(String args []){
        
        Scanner in = new Scanner(System.in);
        
        String name, surname;
        int age;
        String address, streetAddress, streetAddress2, countyAddress;
        String position, department;
        double salary;
        
        // Getting the EmployeeDetails class
        EmployeeDetails empDetails = new EmployeeDetails();     //This is for 1st employee 
        EmployeeDetails empDetails2 = new EmployeeDetails();
        
        System.out.println("Enter Employee First Name");
        name = in.next();
        System.out.println("Enter Employee Surname");
        surname = in.next();
    
        empDetails.setName(name); // set name
        empDetails.setSurname(surname);
        
        System.out.println("Enter Employee's Age");
        age=in.nextInt();
        empDetails.setAge(age); // set age
        
        System.out.println("Enter Employee's Address");
        address= in.next();
        streetAddress=in.next();
        streetAddress2=in.next();
        countyAddress=in.next();
        empDetails.setAddress(address);
        empDetails.setStreetAddress(streetAddress);
        empDetails.setCountyAddress(countyAddress);
    
    
        System.out.println("Enter Employee's Department");
        department=in.next();
        empDetails.setDepartment(department);
    
    
        System.out.println("Enter Employee's Position");
        position= in.next();
        empDetails.setPosition(position);
    
    
        System.out.println("Enter Employee's Salary");
        salary=in.nextDouble();
        empDetails.setSalary(salary);
        
        System.out.println("");
   
        //Employee 2
        System.out.println("Enter Employee First Name");
        name = in.next();
        System.out.println("Enter Employee Surname");
        surname = in.next();

        empDetails2.setName(name);
        empDetails2.setSurname(surname);
    
    
        System.out.println("Enter Employee's Age");
        age=in.nextInt();
        empDetails2.setAge(age);


        System.out.println("Enter Employee's Address");
        address= in.next();
        streetAddress=in.next();
        streetAddress2=in.next();
        countyAddress=in.next();
        empDetails2.setAddress(address);
        empDetails2.setStreetAddress(streetAddress);
        empDetails2.setCountyAddress(countyAddress);
    
    
        System.out.println("Enter Employee's Department");
        department=in.next();
        empDetails2.setDepartment(department);
    
    
        System.out.println("Enter Employee's Position");
        position= in.next();
        empDetails2.setPosition(position);

    
        System.out.println("Enter Employee's Salary");
        salary=in.nextDouble();
        empDetails2.setSalary(salary);

    
        if(empDetails.getSalary () > empDetails2.getSalary ()){
          empDetails.print(); // uses the print method
        }
        else{
            // Uses get methods
          System.out.println("Employee Name: " + empDetails2.getName() + " " + empDetails2.getSurname() );
          System.out.println("Employee Age: " + empDetails2.getAge() );
          System.out.println("Employee Address: " + empDetails2.getAddress() +" " +empDetails2.getStreetAddress() + " "  + empDetails2.getCountyAddress() );
          System.out.println("Employee Department: " +empDetails2.getDepartment() );
          System.out.println("Employee Position: " +empDetails2.getPosition() );
          System.out.println("Employee Salary: £" +empDetails2.getSalary() );
        }
    }
    
}
