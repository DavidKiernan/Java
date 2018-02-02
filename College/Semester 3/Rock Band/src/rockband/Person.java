package rockband;
public class Person {
    private String name;

    //DEFAULT CONSTRUCTOR
    public Person(){
        name="";
    }

    //OVERLOAD CONSTRUCTOR
    public Person(String n){
        name=n;
    }

    //SETTER & GETTER

    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }

    //PRINT
    public void print(){
     System.out.println("Name: "+ name);
    }
}
