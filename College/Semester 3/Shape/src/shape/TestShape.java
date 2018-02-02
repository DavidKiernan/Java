// 7 Oct 2014
package shape;

public class TestShape {
    public static void main(String[] args) {
        
        Shape shapes[] = {new Rectangle("red",4,5), new Triangle("blue",4,5),new Circle("black",9),new Cylinder("indigo",5,9)};

        for(int i=0;i<shapes.length;i++) {
            System.out.println("Shape:"+(i+1));
            shapes[i].print();
            shapes[i].calcArea();
            if (shapes[i] instanceof Cylinder) {
                Cylinder c = (Cylinder) shapes[i];
                c.calcVolume();
            }
        }
    }
    
}
