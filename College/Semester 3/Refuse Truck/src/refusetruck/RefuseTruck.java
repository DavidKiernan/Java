package refusetruck;

public class RefuseTruck {
    private int maxBins;
    private int noOfbinsDeclined;
    private int noBinsCollected;
    private double ratePerKg;
    private double totalWeight;
    
    // DEFAULT CONSTRUCTOR

    public RefuseTruck(){
        maxBins=0;
        ratePerKg=0.0;
    }

    //OVERLOAD CONSTRUCTOR
    public RefuseTruck(int max, double rate){
        maxBins=max;
        ratePerKg=rate;
    }

    // GETTER FOR MAX BINS

    public int getMaxBins() {
        return maxBins;
    }
    // SETTER & GETTER FOR BINS COLLECTED

    public void setNoBinsCollected(int binsCollected) {
        noBinsCollected = binsCollected;
    }

    public int getNoBinsCollected() {
        return noBinsCollected;
    }

    public void setCollectBin(double weight){
        if(weight>100|| noBinsCollected>maxBins){
           noOfbinsDeclined++;
            System.out.println("Bin is over the 100Kg weight- Collection declined");
        }
        else{
            noBinsCollected++;
            totalWeight+=weight;
        }
    }

    public void printStats(){
        System.out.println("No of bins collected: "+noBinsCollected);
        System.out.println("No of bins not collected: "+noOfbinsDeclined);
        System.out.println("Average Weight of bins collected is: "+(totalWeight/noBinsCollected)+" Kg");
        System.out.println("Average cost of bins collected is €"+(totalWeight/(ratePerKg * noBinsCollected)));
    }
}
