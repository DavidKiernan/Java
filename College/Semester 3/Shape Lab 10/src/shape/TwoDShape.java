package shape;
public abstract class TwoDShape extends Shape{
    private int rad;
    private int side;

    public TwoDShape(int x1,int y1){
       super(x1, y1);
        rad=0;
        side=0;
    }

    public TwoDShape(int x1, int y1, int rad, int side) {
        super(x1, y1);
        this.rad = rad;
        this.side = side;
    }

    public int getRad() {
        return rad;
    }

    public int getSide() {
        return side;
    }

    public abstract int getArea();
}
