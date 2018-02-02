package rainfall;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author David
 */
public class Rainfall {

    public static void main(String[] args) {
        
        Scanner in=new Scanner(System.in);
        int total=0,hottest,coldest,differance=0,monthSelect,daySelect=0,tempOut=0,check=0;
        int[]average=new int [12];
        String[]month= new String[12];
        month[0]="January";
        month[1]="Febuary";
        month[2]="March";
        month[3]="April";
        month[4]="May";
        month[5]="June";
        month[6]="July";
        month[7]="August";
        month[8]="September";
        month[9]="October";
        month[10]="November";
        month[11]="December";
    
        // Days in each month
        int[]monthDays=new int[12];
        monthDays[0]=31;
        monthDays[1]=28;
        monthDays[2]=31;
        monthDays[3]=30;
        monthDays[4]=31;
        monthDays[5]=30;
        monthDays[6]=31;
        monthDays[7]=31;
        monthDays[8]=30;
        monthDays[9]=31;
        monthDays[10]=30;
        monthDays[11]=31;
        int [][] calendar=new int [12][31];
        Random temps=new Random(); // Random numbers
    
    //populate array
        for(int i=0;i<calendar.length;i++){
            for(int j=0;j<calendar[0].length;j++){
                calendar[i][j]=temps.nextInt(25); // populates the day of the month with random number up to 25
            }
        }
    
    // calculations
        for(int i=0;i<calendar.length;i++){
            total=0;
            hottest=calendar[i][0];
            coldest=calendar[i][0];
            System.out.println("\n"+ month[i]);
            for(int j=0;j<calendar[0].length;j++){
                System.out.print(calendar[i][j]+" ");
                total+=calendar[i][j];
                average[i]=total/calendar[i].length;
                if(calendar[i][j]>hottest){
                    hottest=calendar[i][j];
                }
                if(calendar[i][j]<coldest){
                  coldest=calendar[i][j];
                }
                differance=hottest-coldest;
            }

            System.out.println();
            System.out.print("Average was "+average[i]+"\n");
            System.out.println("Hottest temp was "+hottest);
            System.out.println("Coldest temp was "+coldest);
            System.out.println("The differance was "+month[i]+" was "+differance+"\n");
        }
    
        // Not pressing 1 to end program
        while(check !=1){
            System.out.println("\n\n\nTo find the temperature on a given day ");
            System.out.print("\n\nPlease select month number: \t");
            monthSelect= in.nextInt();
            System.out.print("\nPlease select the day number: \t");
            daySelect=in.nextInt();
            if(monthSelect>12 || daySelect>monthDays[monthSelect-1]){
                System.out.println("\nNot a valid option.");
            }
            else
                tempOut=calendar[monthSelect-1][daySelect-1];
            System.out.println("\n\nThe temperature for that day was "+tempOut);
            System.out.print("\nPress 1 to exit\t\t\t");
            check=in.nextInt();
        }
    }
}
