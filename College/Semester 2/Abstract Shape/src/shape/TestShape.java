package shape;
public class TestShape {
    public static void main(String[] args) {
        
        System.out.println( "Total number of Shapes objects created is " + Shape.numShapes); 
        System.out.println( "Total number of Circle objects created is " + Circle.getCount());

        //create circle and Rectangle objects
        Circle c1 = new Circle(1.0);
        Circle c2 = new Circle(2.5);
        Rectangle r1 = new Rectangle(3.0, 4.0);
        Rectangle r2 = new Rectangle(2.0, 2.0);


        System.out.println("Total area of both rectangles is " + (r1.area() + r2.area()));
        System.out.printf("Total perimeter of both circles is %.2f%n ", (c1.perimeter() + c2.perimeter()));

        //System.out.println( "Total number of Circle objects created is " + c1.getCount());
        //alternate way to retrieve count but only if circleCount is not private
       // System.out.println( "Total number of Circle objects created is " + Circle.circleCount);
        //alternate way using static method
        System.out.println( "Total number of Circle objects created is " + Circle.getCount());
        System.out.println( "Total number of Circle objects created is " + c1.getCount());
        System.out.println( "Total number of Shapes objects created is " + Shape.numShapes); 
    }
}
       
