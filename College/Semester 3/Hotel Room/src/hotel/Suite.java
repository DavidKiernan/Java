package hotel;

public class Suite extends HotelRoom {
    
    //OVERRIDE CONSTRUCTOR
    public Suite(int room){
        super(room);
    }

    //OVERRIDE setRate

    @Override
    public double setRate(){
        super.setRate();
        nightRentRate+=40;
        return nightRentRate;
    }

    @Override
    public void print(){
        super.print();
        System.out.println("Suite charge has been added");
    }
}
