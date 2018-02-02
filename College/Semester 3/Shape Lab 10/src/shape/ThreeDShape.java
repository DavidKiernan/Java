package shape;
public abstract class ThreeDShape extends Shape {
    private int width;
    private int length;
    private int height;

   
    public  ThreeDShape(int x1, int y1, int width, int length, int height) {
        super(x1, y1);
        this.width = width;
        this.length = length;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    public int getHeight() {
        return height;
    }

    public abstract int getArea();
    public abstract int getVolume();
}
