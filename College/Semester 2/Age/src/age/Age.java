package age;

import java.util.Scanner;

/**
 * @author David
 * User enters 5 Surnames and Ages and it compares the Ages
 * Printing out the oldest age and youngest too
 * Along with The Surnames and Ages
 */
public class Age {

    public static void main(String[] args) {
        
        Scanner in=new Scanner(System.in);
        int oldest=0;
        int maxAge;
        int youngest=0;
        int lowAge;
    
        String[]surname=new String [5];
        int []age=new int [5];
    
        for(int count=0;count<surname.length;count++){
            System.out.println("Enter Surname"+(count+1));
            surname[count]=in.next();
        }
        for(int count=0;count<age.length;count++){
            System.out.println("Enter age"+(count+1));
            age[count] =in.nextInt();
        }
        
        
        
        for(int count=0;count<surname.length;count++){
          System.out.println("The Surname is "+surname[count]);
        }
        
        for(int count=0;count<age.length;count++){
            System.out.println("The ages are "+age[count]);
        }
        maxAge = age[0];
        for(int count=1;count<age.length;count++){
            if(age[count]>maxAge){
            maxAge=age[count];
            }
        }
        lowAge = age[0];
        for(int count=1;count<age.length;count++){
          if(age[count]<lowAge){
            lowAge=age[count];
            youngest=age[count];
          }
        }
        System.out.println("The oldest is "+maxAge);
        System.out.println("The youngest is "+youngest);
    }
    
}
