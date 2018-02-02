package animal;
public class Animal {
    private int id;
    private String type;

    public Animal(int uniqueId, String typeIn){
      id=uniqueId;
      type=typeIn;
    }

    public void printDetails(){
      System.out.println("ID: "+id);
      System.out.println("Type: "+type);
    }
}
