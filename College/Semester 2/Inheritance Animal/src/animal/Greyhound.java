package animal;
public class Greyhound extends Animal{
    
    private String name, fName, mName; //fName is Fathers Name, mName is Mothers Name
    private int age, races, won;

    public Greyhound(int uniqueId, String typeIn, String nameIn,int ageIn,String fNameIn, String mNameIn){
      super(uniqueId, typeIn); // This line always goes first
      name=nameIn;
      age=ageIn;
      fName=fNameIn;
      mName=mNameIn;
    }

    public String getName(){
      return name;
    }

    public int getWon(){
      return won;
    }

    public void updateWinningRecord(boolean wonRace){// Boolean if answer is "Yes" or "No" as this has won race or not
      races+=1;
      if(wonRace ==true){
        won+=1;
      }
    }


    @Override
    public void printDetails(){
      super.printDetails();                       //This always goes 1st in print method
      System.out.println("Name: " +name);
      System.out.println("Age: " +age);
      System.out.println("Father: " +fName);
      System.out.println("Mother: "+mName);
      System.out.println("Has Run " +races+" Races And Won " +won);
    }
}
