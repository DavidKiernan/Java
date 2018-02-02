public class TestClass {
	public static void main ( String args[])
 	{
 				
 		double mydata[] = {2.2,3.2,4.5,4.0};				
 				
 		LUASJourney j1 = new  LUASJourney(mydata);		    
 				
 		Thread t1 = new Thread(j1);					        
 		t1.start();							                
 			
		try {

			t1.join();

		} catch (InterruptedException ie) {}
 						
 		System.out.println("Total journey time for this journey is " + j1.getTotalJourneyTime());  
 	}
}



