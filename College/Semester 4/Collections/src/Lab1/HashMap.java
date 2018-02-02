package Lab1;

/**
 * Created by x00093830 on 22/04/2015.
 */
public class HashMap {
    public static void main(String[] args){

        // declare and initialize hashmap
        java.util.HashMap hm = new java.util.HashMap();

        // put K.V. pairs into hashmap
        hm.put("render", "to cause to be or become; make");
        hm.put("immoderate", "exceeding just or reasonable limits");
        hm.put("foliaceous","pertaining to or consisting of leaves");
        hm.put("insubordinate", "not submitting to authority; disobedient");
        hm.put("creek", "a stream, brook, or a minor tributary of a river");

        // look up Values by Keys in hashmap
        System.out.println("The definition of \"render\" is: " + hm.get("render"));
        System.out.println("The definition of \"insubordinate\" is: " + hm.get("insubordinate"));
        System.out.println("The definition of \"googol\" is: " + hm.get("googol"));
    }
}
