/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tax;

/**
 *
 * @author David
 */
public abstract class Employee implements IPayable{
    private String fName;
    private String lName;
    private String rsi;

    public Employee(){
        fName="";
        lName="";
        rsi="";
    }
    public Employee(String f, String l, String r) {
        fName = f;
        lName = l;
        rsi = r;
    }

    public void setfName(String f) {
        fName = f;
    }

    public String getfName() {
        return fName;
    }

    public void setlName(String l) {
        lName = l;
    }

    public String getlName() {
        return lName;
    }

    public void setRsi(String r) {
        rsi = r;
    }

    public String getRsi() {
        return rsi;
    }

    @Override
    public String toString() {
        return "\nEmployee" +"\n First name: "+fName +"\n Last Name: "+lName+"\n RSI Number: "+rsi;
    }
}
