package shape;

public class Sphere extends ThreeDShape{
    public Sphere(int x1, int y1, int radius) {
        super(x1, y1, radius, radius, radius);
    }

    @Override
    public String getName() {
        return "Sphere";
    }

    public int getRadius(){
        return super.getWidth();
    }

    @Override
    public int getArea() {
        double cast=4*Math.PI*getRadius()*getRadius();
        int cast1=(int)cast;
        return cast1;
    }

    @Override
    public int getVolume() {
        double cast= (4 * Math.PI * getRadius()*getRadius()*getRadius())/3;
        int cast2=(int)cast;
        return cast2;
    }

    @Override
    public String toString() {
        return super.toString()+" Radius "+ getRadius();
    }
}
