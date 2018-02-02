package employee;

/**
 *
 * @author David
 */
public class EmployeeDetails {
    // Data Members for the class
    
    String name, surname;
    int age; // Personal details
    String address, streetAddress, streetAddress2, countyAddress; // Address
    String position, department; // work details
    double salary;

    // Getter method, get info required
    public String getName() {
        return name;
    }

    // Setter Methods, set the variable to this value 
    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getStreetAddress2() {
        return streetAddress2;
    }

    public void setStreetAddress2(String streetAddress2) {
        this.streetAddress2 = streetAddress2;
    }

    public String getCountyAddress() {
        return countyAddress;
    }

    public void setCountyAddress(String countyAddress) {
        this.countyAddress = countyAddress;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    // Method to print details
    public void print(){
        System.out.println("Name: " + name);
        System.out.println("Surname : " + surname);
        System.out.println("Address : " + address);
        System.out.println("Age : " + age);
        System.out.println("Department : "+ department);
        System.out.println("Position : " + position);
        System.out.println("Salary : " + salary);
    }
}
