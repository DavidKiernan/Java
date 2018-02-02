package arrays;

/**
 *
 * @author David
 */
public class MultiArray {
      public static void main (String args[])
    {
        int[][]nums=new int [20][20];
        int row,col;
        int value=0;
  
        for(row=0;row<nums.length;row++){
            for(col=0;col<nums[0].length;col++){
                nums[row][col]=value;
                value++;
                System.out.println(nums[row][col]);
            }
        }
    }
}
