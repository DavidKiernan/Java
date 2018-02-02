public class LUASJourney extends Journey implements Runnable 
{

	private double totalTime = 0;

	public LUASJourney(double stationTimes[]) {
		super(stationTimes); 
	}

	// Thread start point
	public void run() 
	{

		for (int i = 0; i < timeInterval.length; i++) 
		{
			totalTime += timeInterval[i];

			try {

				Thread.sleep(2000); 

			} catch (InterruptedException ie) {
			}
		}
	}

	// returns total journey time
	public double getTotalJourneyTime() { 
		return totalTime;
	}
}
