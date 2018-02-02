package shape;

public class Cube extends ThreeDShape{
    
    public Cube(int x1, int y1, int side) {
        super(x1, y1, side, side, side);
    }

    @Override
    public String getName() {
        return "Cube";
    }

    public int getSide(){
        return super.getHeight();
    }

    @Override
    public int getArea() {
        return 6*getSide()*getSide();

    }

    @Override
    public int getVolume() {
        return getSide()*getSide()*getSide();

    }

    @Override
    public String toString() {
        return super.toString()+" Side "+getSide();
    }
}
