/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel;

/**
 *
 * @author David
 */
public class Hotel {
    private String name;
    private String address;
    private int year;//this is year of hotel built
    private int room;
    private boolean spa;

    // Constructor

    public Hotel(String nameIn, String addressIn, int yearIn, int roomIn,boolean spaIn){
      name=nameIn;
      address=addressIn;
      year=yearIn;
      if(yearIn<0){
        year=0; // year less than 0 set it to 0
      }
      room=roomIn;
      if(roomIn<0){
        room=0;
      }
      spa=spaIn;
    }

    //no-args Constructor

    public Hotel(){
      name= "";
      address= "";
      year=0;
      room=0;
      spa=false;
    }
    // Insurance Method

    public int costInsurance(){
      int amount;
      
      if(year >=1920 && year <= 1950){
          amount = 1000;
        }
      else if(year >=1951 && year <= 1999){
          amount = 750;
        }
      else{
          amount = 500;
        }
      if(room <25){
          amount += 300;
        }

      else if(room >=25 && room <=50){
          amount+= 400;
        }
      
      else if(room >=51 && room <=100){
          amount += 650;
        }
      else{
          amount +=900;
        }

      if(spa == true){ // add 300 if spa
          amount += 300;
        } 
      else{
          amount=amount;
        }
      return amount;
    }

    // Print Mehtod 
    public void print(){
      System.out.println("The hotel name is " + name);
      System.out.println("The hotel address is " +address);
      System.out.println("The year the hotel was built was " +year);
      System.out.println("The number of rooms in the hotel is " +room);
      
      if(spa == true){
        System.out.println("The hotel has a spa");
      }
      else{
        System.out.println("The hotel doesn't have a spa");
      }
    }
}
