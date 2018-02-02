package address_book;

public class AddressBook {
    private String[] names; // array contains the names
    private String[] addresses; // array contains the addresses
    private int n;

    // Default Constructor

    public AddressBook(){
      n = 0;
      names = new String[10];
      addresses = new String[10]; // Default capacity set to 10 for both
    }

    // Overloaded Constructor

    public AddressBook(int size){
      n = 0;
      names = new String[size];
      addresses = new String[size];
    }

    // Add Method

    public void add(String contactName, String contactAddress){
      names[n] = contactName;
      addresses[n] = contactAddress;
      n++;
    }

    // Index Of Method

    public int indexOf(String nameToFind){
      for(int index = 0; index < n; index++){
        if(nameToFind.equals(names[index])){
          return index;
        }
      }
      return -1; //If string not found, ends program
    }

    // Modify method

    public void modify(int index, String newAddress){
      addresses[index] = newAddress;
    }

    // Search Method
    public void search(String nameToFind){
      boolean found = false;
      for(int index = 0; index < n; index++){
        if(nameToFind.equalsIgnoreCase(names[index])){
          System.out.println("The person " +names[index] + " was found and lives in " +addresses[index]);   
          found = true;
        }
      }
      if(found == false){
        System.out.println("Not Found");
      }
    }

    // Print Method
    public void print(){
      for(int index = 0; index < n; index++){
        System.out.println("The person " +names[index] +" lives in the address " +addresses[index]);
      }
    }
}
