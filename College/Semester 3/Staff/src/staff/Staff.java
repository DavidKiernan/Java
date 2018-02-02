package staff;
public class Staff {
    private StaffMember[] staff;

    public Staff() {
        staff = new StaffMember[]{

                new Executive("John", "1 This St", "0874323476", "R6574635", 2423.07),
                new Employee("Paul", "2 That St", "0854345222", "P8884635", 1246.15),
                new Employee("Dave", "3 Other St", "0864343566", "S9876635", 1169.23),
                new Hourly("Joanne", "4 Long Ave.", "0836789676", "T0987635", 10.55),
                new Volunteer("Norma", "5 Short Ave.", "0864323456"),
                new Volunteer("Kate", "6 Pecks Lane", "0854676767"),
                new Commission("Molly", "7 Nowhere Rd.", "0864326789", "L6599635", 6.25, .2),
                new Commission("Joe", "My Place", "0864344545", "G8888635", 9.75, .15)
        };
    }

    public void processStaff() {
        for (int i = 0; i < staff.length; i++) {
            if (staff[i] instanceof Executive && staff[i].name == "John") {
                Executive e = (Executive) staff[i];
                e.awardBonus(500);
            } else if (staff[i] instanceof Hourly && staff[i].name=="Joanne") {
                Hourly h = (Hourly) staff[i];
                h.addHours(40);
            } else if (staff[i] instanceof Commission && staff[i].name == "Molly") {
                Commission c = (Commission) staff[i];
                c.addHours(35);
                c.totalSales(400);
            }
            else if(staff[i] instanceof Commission && staff[i].name == "Joe"){
                Commission c1 =(Commission) staff[i];
                c1.addHours(40);
                c1.totalSales(950);
            }
        }
    }

    public void payday() {
        for (int i = 0; i < staff.length; i++) {
            System.out.println(staff[i]);
            System.out.println(" Paid "+staff[i].pay());
            System.out.println("----------------------------");
        }
    }
}
