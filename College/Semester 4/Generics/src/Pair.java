/**
 * Created by x00093830 on 29/04/2015.
 */
public class Pair<T> {
    //Fields
    private T first;
    private T second;

    //Constructor
    public Pair(T f, T s){
        first = f;
        second = s;
    }

    T getFirst(){return first;}
    T getSecond() {return second;}

    void setFirst(T f){first = f;}
    void setSecond(T s){second =s;}

    public String toString(){
        return "("+first.toString()+", "+second.toString()+")";
    }
}
