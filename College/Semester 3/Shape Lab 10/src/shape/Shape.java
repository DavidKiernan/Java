package shape;
public abstract class Shape {
    private int x;
    private int y; //x and y represents the co-ordinate of the centre of the shape

    public Shape(){
        x=0;
        y=0;
    }
    public Shape(int x1, int y1){
        x=x1;
        y=y1;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return  " (" + x + "," + y+")" ;
    }

    public abstract String getName();
}
