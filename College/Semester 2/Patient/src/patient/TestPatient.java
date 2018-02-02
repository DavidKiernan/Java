/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patient;

/**
 *
 * @author David
 */
public class TestPatient {
    public static void main(String[] args){
  
        Patient p1 = new Patient("Austin","Jane", true, true );
        Patient p2 = new Patient("James","Henry", false, true);    
        p1.setLengthOfStay(10);
        p2.setLengthOfStay(5);

        p1.print();
        System.out.println("Bill : " + p1.getBill());
        System.out.println("");
        p2.print();
        System.out.println("Bill : " + p2.getBill());
        System.out.println("");
    }
}
