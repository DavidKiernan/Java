package patient;
/**
 *
 * @author David
 */
public class Patient {
    
    //Attributes
  
    private String fName;
    private String sName;
    private boolean medicalCard;
    private boolean patientType;
    private int numberOfDays;

    //Constructor Method

    Patient(String lastNameIn, String firstNameIn, boolean medicalCardIn, boolean patientTypeIn){
      sName = lastNameIn;
      fName = firstNameIn;
      medicalCard = medicalCardIn;
      patientType=patientTypeIn;
    }

    //Setter Method for Medical Card

    public void setMedicalCard(String newMedicalCard){

      if(newMedicalCard =="yes"){
        this.medicalCard= true;
      }
      else {
        this.medicalCard= false;
      }

    }

    //Setter Method for PatientType

    public void setPatientType(String  newPatientType){

      if(newPatientType=="Private"){
        this.patientType= true;
      }
      else {
        this.patientType= false;
     }
    }

    //Setter Method to update number of days patient stayed

    public void setLengthOfStay(int lengthOfStayIn){
      this.numberOfDays=lengthOfStayIn;
    }

    //Getter Method for the First Name And Surname

    public String getFName(){
      return fName;
    }

    public String getSName(){
      return sName;
    }

    // Bill Code


    public double getBill(){

      double bill = 0;

       if ( medicalCard == false ){
         if ( patientType == true ) {
           bill  = numberOfDays * 100;
         }
         else if ( patientType == false ) {
           bill = numberOfDays * 20; 
         }
       } 
      else {
        bill = 0;
      }

      return bill;
    }


    //Print Method

    public void print(){
      System.out.println("Patient Surname                :" + sName);
      System.out.println("Patient First Name             :" + fName);
      System.out.println("Does Patient Have Medical Card :" + medicalCard);
    }
}
