package pet;

/**
 *
 * @author David
 */
public class Pet {
    private String name;
    private int    age;
    private double weight;
    private int    height;

    // No args Constructor

    public Pet(){
      name= "No name yet";
      age=0;
      weight=0.0;
      height=0;
    }

    //Overload Constructor

    public Pet(String nameIn){
      name=nameIn;
      age=0;
      weight=0.0;
      height=0;
    }
    // Overload Constructor

    public Pet(String nameIn, int ageIn, double weightIn, int heightIn){
      name=nameIn;
      age=ageIn;
      if(age<0){
        age=0;
      }
      weight=weightIn;
      if(weight<0){
        weight=0;
      }
      height=heightIn;
      if(height<0){
        height=0;
      }
    }

    //Setter Method for Name

     public void setName(String newName){
    this.name = newName;
    }

     //Getter

    public String getName(){
      return name;
    }


    //Setter Method for Age

     public void setAge(int newAge){
       if (newAge<0){
         this.age=0;
       }
       else{
         this.age = newAge;
       }
     }

    //Getter
    public int getAge(){
      return age;
    }

    //Setter for weight

    public void setWeight(double poundWeight, double ounceWeight){
      poundWeight *= 16; 
      ounceWeight+= poundWeight;
      this.weight = ounceWeight;
    }

    //Getter
    public double getWeight(){
      return weight;
    }

    //Setter for Height

    public void setHeight(int footHeight, int inchHeight){
      footHeight *= 12;
      inchHeight += footHeight;
      this.height = inchHeight;
    }

    //Getter

    public int getHeight(){
      return height;
    }

    // isHealthy Method (Boolean)

    public String isHealthy (){
    boolean success;
    String health;
    if((weight/height)>=3.5 &&(weight/height) <=5){
      success= true;
      health =" Healthy"; 
    }
    else{
      success = false;
      health =" is Not Healthy";
    }
    return health;
    }
}
