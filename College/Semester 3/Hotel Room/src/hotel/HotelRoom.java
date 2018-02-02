package hotel;
public class HotelRoom {
    private int roomNum;
    protected double nightRentRate;

    //DEFAULT CONSTRUCTOR
    public HotelRoom(){
        roomNum=0;
        nightRentRate=0;
    }

    //CALC RATE

    public double setRate(){
        if(roomNum<=299){
            nightRentRate=70;
        }
        else{
            nightRentRate=90;
        }
        return nightRentRate;
    }


    //OVERLOAD CONSTRUCTOR
    public HotelRoom(int room){
        roomNum=room;
        nightRentRate=setRate();
    }

    //SETTER AND GETTER METHODS

    public void setRoomNum(int number){
        roomNum=number;
    }
    public int getRoomNum(){
        return roomNum;
    }

    public double getNightRentRate(){
        return nightRentRate;
    }

    //PRINT METHOD

    public void print(){
        System.out.println("Room number: "+roomNum);
        System.out.println("Costs "+nightRentRate+" per night");
    }
}
