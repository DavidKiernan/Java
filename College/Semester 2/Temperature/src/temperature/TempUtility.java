/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temperature;

/**
 *
 * @author David
 */
public class TempUtility {
    private final String[] DAYS = {"Monday", "Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};

    //MIN TEMP
    public double minTemp(double []tempIn){
      int min =0;
      for(int i=0; i< DAYS.length; i++){
        if(tempIn[i] < tempIn[min]){
          min=i;
        }
      }
      return tempIn[min];
    }

    //MAX TEMP
    public double maxTemp(double []tempIn){
      int max=0;
      for(int i=0; i< DAYS.length; i++){
        if(tempIn[i] < tempIn[max]){
          max=i;
        }
      }
      return tempIn[max];
    }

    //TEMP RANGE

    public double tempRange(double []tempIn){
        double tempDifferance = maxTemp(tempIn)-minTemp(tempIn);
        return tempDifferance;
    }



    // AVG TEMP

    public double avgTemp(double []tempIn){
      double total=0, average=0;
      for(int i=0; i<DAYS.length; i++){
        total +=tempIn[i];
      }
      average = total/DAYS.length;
      return average;
    }

    //PRINT TEMP 

    public void print(double[] tempIn){
      for(int i=0; i<DAYS.length; i++){
        System.out.println("The Temperature For " +DAYS[i] +" Was " +tempIn[i]);
      }
    }

    // PRINT DAY

    public void print(double[] tempIn, int dayIn){
      System.out.println("The Temperature For " +DAYS[dayIn-1] +" Was " +tempIn[dayIn-1]);
    }
}
