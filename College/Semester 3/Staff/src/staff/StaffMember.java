// 14 October 2014
package staff;
public abstract class StaffMember {
    protected String name;
    private String address;
    private String phoneNum;

    public StaffMember(String n, String ad, String ph){
        name=n;
        address=ad;
        phoneNum=ph;
    }

    @Override
    public String toString(){
        return "Name: "+name+"\n Address: "+address+"\n Phone Number "+ phoneNum;
    }

    public abstract double pay();
}
