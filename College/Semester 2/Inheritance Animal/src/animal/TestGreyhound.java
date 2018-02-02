package animal;
public class TestGreyhound {
    public static void main(String[] args) {
                                   // ID, TYPE,        NAME,    AGE, FATHER,     MOTHER
        Greyhound dog1=new Greyhound(1234,"greyhound","Mrs.Flash",2,"Tom Foley","The Late Show");
        Greyhound dog2=new Greyhound(6788,"greyhound","Mr.Jones",3,"Icarus","Isis");

        dog1.printDetails();
        System.out.println();
        dog1.updateWinningRecord(true); // adds 1 to wins & Races
        dog1.updateWinningRecord(true);
        dog1.updateWinningRecord(false);
        dog1.printDetails();
        System.out.println();
        dog2.updateWinningRecord(true);  
        dog2.updateWinningRecord(false);
        dog2.printDetails();

        System.out.println();
        if(dog1.getWon() > dog2.getWon()){
          System.out.println(dog1.getName() +" has won more races");
        }
        else if(dog1.getWon() < dog2.getWon()){
          System.out.println(dog2.getName() + " has won more races");
        }
        else{
          System.out.println("Both greyhound have won an equal amount of races");
        }
    }
    
}
