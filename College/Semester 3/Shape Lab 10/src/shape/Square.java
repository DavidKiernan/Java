package shape;

public class Square extends TwoDShape{
    
    public Square(int x1, int y1,int side) {
        super(x1, y1, side, side);
    }

    @Override
    public String getName() {
        return "Square";
    }

    @Override
    public int getSide() {
        return super.getSide();
    }

    @Override
    public int getArea() {

      return getSide()*getSide();

    }

    @Override
    public String toString() {
        return super.toString()+" Side "+getSide();

    }
}
