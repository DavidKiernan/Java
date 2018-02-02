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
public class TestPrintcard {
    public static void main(String args []){
        
        Printcard card1 = new Printcard();
        card1.accountNumber = "Dave";
        //student1.setName("Dave"); the .set is the only differance//
        card1.password = "X00093830";
        card1.numberCredits = 5;

        card1.print();
    }
}
