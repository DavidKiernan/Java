package dvd;

/**
 *
 * @author David
 */
public class DVD {
    private String name;
    private String genre;
    private int noOfCopies;
    private int noRented;
    private double costPerNight;

    // Default Constructor 

    public DVD (){
      name="";
      genre="";
      noOfCopies=0;
      noRented=0;
      costPerNight=0;
    }

    // Overload Constructor

    public DVD (String nameIn, String genreIn, int noCopies,double costPerNightIn){
      name=nameIn;
      genre=genreIn;
      noRented=0;
      costPerNight=costPerNightIn;
      noOfCopies=noCopies;
      if(noCopies<0){
        noOfCopies=0;
      }
    }

    // Rent Method

    public double rent (int nightsRented){
      double cost=costPerNight;
       if(nightsRented > 5){
        System.out.println("Renting cannot exceed 5 days");
       }

       else if(noOfCopies >0){
        noOfCopies -=1;
        noRented +=1;
        cost *= nightsRented;
       }
       else{
         System.out.println("Not Enough Copies In Store");
       }
       return cost;
     }

    // Print Method

    public void print(){
      System.out.println("The Name Of The DVD Is " +name);
      System.out.println("The Genre Of The DVD Is " +genre);
      System.out.println("The Number Of Copies In Store Is " +noOfCopies); 
      System.out.println ("The Number of Copies Rented Out Is "+noRented);
      System.out.printf("The Cost Per Night To Rent Is € %.2f\n" ,costPerNight);

    }
}
