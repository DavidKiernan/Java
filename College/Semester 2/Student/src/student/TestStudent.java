/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

/**
 *
 * @author David
 */
public class TestStudent {
    public static void main(String args[]){
        
        Student student1 = new Student();
        Printcard jacksCard = new Printcard();
    
        double average;
        int credits;

        //student1.name = "Dave";
        student1.setName("Dave"); //the .set is the only difference//
        student1.setStudentID ("X00093830");
        student1.setSubject  ("SDVEC");
        student1.setCa1Result (50);
        student1.setCa2Result (70);
        jacksCard.setNumberCredits(0);

        average = ((student1.getCa1Result () + student1.getCa2Result() )/2);
        System.out.println("Average Is "+average);

        if(average >=70){
         credits =jacksCard.getNumberCredits() + 400;
         jacksCard.setNumberCredits(credits);
        }


        jacksCard.print();
        student1.print();
    }
    
}
