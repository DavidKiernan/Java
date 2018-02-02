package election;

import java.util.Scanner;

/**
 *
 * @author David
 */
public class Election {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
    
        String[]candidate=new String [5];
        int []votes=new int [5];
        double[]percent=new double[5];
        int totalVotes=0,tempVotes=0,maxVotes=0,loc=0,mostVotes;
        double tempPercent=0;
        String tempCandidate;
      
        // Enter candidates and votes
        for(int count=0;count<votes.length;count++){
            System.out.println("Enter Candidate"+(count+1));
            candidate[count]=in.next();
      
            System.out.println("Enter Votes recived by each candidate"+(count+1));
            votes[count] =in.nextInt();
        }
     
        for(int count=0;count<votes.length;count++){
            totalVotes+=votes[count];
        }


        for(int count=0;count<votes.length;count++){
          percent[count]=votes[count]/(totalVotes /100);
        }
    
        //Display table before sorting
    
        System.out.println("Candidate\tVotes\t%ofvotes");
        for(int count=0;count<votes.length;count++){
            System.out.println(candidate[count]+"\t"+votes[count]+"\t"+percent[count]);
        }
    
        for(int count=0;count<votes.length;count++){
            if(votes[count]>maxVotes){
                maxVotes=votes[count];
            }
        }
        while(loc<votes.length&&votes[loc]!=maxVotes){
            loc++;
        }
        System.out.println("total Votes:"+totalVotes);
        System.out.println("The winner of the election is: "+candidate[loc]);
    
        //Bubble sort for ASCENDING ORDER
    
        for(int pass=0;pass<votes.length-1;pass++){
          for(int index=0;index<votes.length-1-pass;index++){
                if(votes[index]>votes[index+1]){
                    tempPercent=percent[index];
                    percent[index]=percent[index+1];
                    percent[index+1]=tempPercent;

                    tempCandidate=candidate[index];
                    candidate[index] = candidate[index+1];
                    candidate[index+1] = tempCandidate;

                    tempVotes = votes[index];
                    votes[index] = votes[index+1];
                    votes[index+1] = tempVotes;
                }
            }
        }
        // Display table aftering sorting
        System.out.println("\nDisplaying After Sorting\n");
        System.out.println("Candidate\tVotes\t%ofvotes");
        for(int count=0;count<votes.length;count++){
            System.out.printf("%s\t%d\t%.2f\n",candidate[count],votes[count],percent[count]);  
        }
    }   
}
