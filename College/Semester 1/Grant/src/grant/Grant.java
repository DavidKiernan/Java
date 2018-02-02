package grant;

import java.util.Scanner;

/**
 *
 * @author David
 * on 21th November 2013
 * CA
 */
public class Grant {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Constants
        final double FEE_PAID_1=1.0;
        final double FEE_PAID_2=0.75;
        final double FEE_PAID_3=0.50;
        final double FEE_PAID_4=0.0;
        final int FEE=3000;

        // Variables
        String studentName,studentNumber, dummy; // dummy needed due to a bug
        int mark, userChoice, studentCount=0, students100Fee=0,students75Fee=0,students50Fee=0, students0Fee=0; // a total count and a count broken down by grant type
        double grantPaid = 0;
        double feeDue=0;
        double grantPaidToCollege=0;
        double feePaidByStudent=0;

        System.out.println("      Menu      ");
        System.out.println("1.\t Calculate Grant");
        System.out.println("2.\t Display Fee Statistics");
        System.out.println("3.\t Display Number of Students in Each Category");
        System.out.println("4.\t Exit");

        System.out.println("Enter Choice");
        userChoice=in.nextInt();

        while(userChoice!=4) // while not 4 stuck in the following
        {
            if(userChoice==1) // choice is 1
            {
                // enter the details
                System.out.println("Enter Student Name");
                dummy=in.nextLine(); // needed due to a bug
                studentName = in.nextLine();
                System.out.println("Enter Student Number");
                studentNumber=in.nextLine ();
                System.out.println("Enter Student Average Mark");
                mark=in.nextInt();

                if(mark < 40) // mark less than 40
                {
                    System.out.println("No Grant Given");
                    grantPaid=FEE*FEE_PAID_4; // grant paid is this fee type
                    feeDue=FEE-grantPaid; // the fee due is FEE - grant paid

                    studentCount++; // adds 1 to the student count
                    students0Fee++; // adds 1 to students that pay all fees

                    grantPaidToCollege+=grantPaid; // add the grant paid to the grants paid by college
                    feePaidByStudent+= feeDue;

                    System.out.println(studentName);
                    System.out.println(studentNumber);
                    System.out.println("This Student received a grant of 0%");
                    System.out.printf("The Fees Owed is €%.2f%n", feeDue); // format to 2 dp
                }
                else if(mark<60)
                {
                    System.out.println("50% Grant Given");
                    grantPaid=FEE*FEE_PAID_3;
                    feeDue=FEE-grantPaid;

                    studentCount++;
                    students50Fee++;
                    grantPaidToCollege+=grantPaid;
                    feePaidByStudent+= feeDue;

                    System.out.println(studentName);
                    System.out.println(studentNumber);
                    System.out.println("This Student received a grant of 50%");
                    System.out.printf("The Fees Owed is €%.2f%n", feeDue);
                }
                else if(mark<80)
                {
                    System.out.println("80% Grant Given");
                    grantPaid=FEE*FEE_PAID_2;
                    feeDue=FEE-grantPaid;
                    studentCount++;
                    students75Fee++;

                    grantPaidToCollege+=grantPaid;
                    feePaidByStudent+= feeDue;

                    System.out.println(studentName);
                    System.out.println(studentNumber);
                    System.out.println("This Student received a grant of 75%");
                    System.out.printf("The Fees Owed is €%.2f%n", feeDue);
                }
                else if(mark<=100)
                {
                    System.out.println("100% Grant Given");

                    grantPaid=FEE*FEE_PAID_1;
                    feeDue=FEE-grantPaid;

                    studentCount++;
                    students100Fee++;

                    grantPaidToCollege+=grantPaid;
                    feePaidByStudent+= feeDue;

                    System.out.println(studentName);
                    System.out.println(studentNumber);
                    System.out.println("This Student received a grant of 100%");
                    System.out.printf("The Fees Owed is €%.2f%n", feeDue);
                }
                else
                {
                    System.out.println("Invalid Choice");
                }

                System.out.println("      Menu      ");
                System.out.println("1.\t Calculate Grant");
                System.out.println("2.\t Display Fee Statistics");
                System.out.println("3.\t Display Number of Students in Each Category");
                System.out.println("4.\t Exit");

                System.out.println("Enter Choice");
                userChoice=in.nextInt();
            }

            else if(userChoice==2) // choice is 2, stats
            {
                //grantPaidToCollege=grantPaid;
                //feePaidByStudent=feeDue; // may need these here
                System.out.println("Overall Fees Paid By Grants: " + grantPaidToCollege); // gets all the grants paid to the college
                System.out.println("Overall Non-Grant Free Paid to College: " + feePaidByStudent); // prints out all the fees paid by the students

                System.out.println("      Menu      ");
                System.out.println("1.\t Calculate Grant");
                System.out.println("2.\t Display Fee Statistics");
                System.out.println("3.\t Display Number of Students in Each Category");
                System.out.println("4.\t Exit");

                System.out.println("Enter Choice");
                userChoice=in.nextInt();
            }

            else if(userChoice==3) // choice is 3 Number of Students
            {
                System.out.println("The number of students that did not receive a grant is " +students0Fee);
                System.out.println("The number of students that received a 50% grant is " +students50Fee);
                System.out.println("The number of students that received a 75% grant is " +students75Fee);
                System.out.println("The number of students that received a 100% grant is " +students100Fee);

                System.out.println("      Menu      ");
                System.out.println("1.\t Calculate Grant");
                System.out.println("2.\t Display Fee Statistics");
                System.out.println("3.\t Display Number of Students in Each Category");
                System.out.println("4.\t Exit");

                System.out.println("Enter Choice");
                userChoice=in.nextInt();
            }
        }
    }
    
}
