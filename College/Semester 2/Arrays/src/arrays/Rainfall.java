package arrays;

/**
 *
 * @author David
 * Calculate Average rainfall for 2 regions
 * Over a 3 month Range
 */
public class Rainfall {
    public static void main(String[] args) {
        double sum = 0;
        double average = 0;
        double[][]rainfall={{3.2,3.4,3.1},{4.7,6.0,4.3}}; // Arrays for rainfall in 2 regions

        System.out.println("Region\t Jan\t Feb\t Mar\t Average Rainfall");
        for(int i=0;i<rainfall.length;i++){
          System.out.print((i+1)+"\t");
          sum = 0; // sets sum to 0 when going onto next column
          for(int j=0;j<rainfall[0].length;j++){
            sum=sum+rainfall[i][j];
            System.out.print(rainfall[i][j]+"\t");
          }
          
          average=sum/rainfall[0].length;
          System.out.printf("%.2f%n",average);
        }
    }
    
}
