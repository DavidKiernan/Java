package shape;
public class Circle extends TwoDShape {
    public Circle(int x1, int y1, int rad) {
        super(x1, y1, rad,rad);
    }

    @Override
    public String getName() {
        return "Circle";
    }

    @Override
    public int getRad() {
        return super.getRad();
    }

    @Override
    public int getArea() {
        double cast=Math.PI*getRad()*getRad();
        int cast1=(int) cast;
        return cast1;

    }

    @Override
    public String toString() {
        return super.toString()+" Radius: "+getRad();

    }
}
