// 22 Oct 2014
package shape;
public class TestShape {

    public static void main(String[] args) {
        
        int count = 0;
        double total = 0;
        double min = 100, max = 0, current = 0;
        String minName = "", maxName = "";
        String currentName;
        Shape shapes[] = {new Circle(22, 88, 4), new Square(71, 96, 10), new Sphere(8, 89, 2), new Cube(79, 61, 8)};
        Paint p = new Paint(70);
        for (int i = 0; i < shapes.length; i++) {
            if (shapes[i] instanceof TwoDShape) {
                TwoDShape td = (TwoDShape) shapes[i];
                System.out.println(td.getName() + "" + td.toString());
                System.out.println("Area of " + td.getName() + " " + td.getArea());
                System.out.printf("Amount of paint required is %.2f%n ", p.calcAmount(td));
                count++;
                total += p.calcAmount(td);
                current = p.calcAmount(td);
                System.out.println();
            } else if (shapes[i] instanceof ThreeDShape) {
                ThreeDShape d3 = (ThreeDShape) shapes[i];
                System.out.println(d3.getName() + "" + d3.toString());
                System.out.println("Area of " + d3.getName() + " is: " + d3.getArea());
                System.out.println("Volume of " + d3.getName() + " is: " + d3.getVolume());
                System.out.printf("Amount of paint required is %.2f%n ", p.calcAmount(d3));
                count++;
                total += p.calcAmount(d3);
                current = p.calcAmount(d3);
                System.out.println();
                System.out.println();

            }
            currentName = shapes[i].getName();
            if (current < min) {
                min = current;
                minName = currentName;
            }

            if (current > max) {
                max = current;
                maxName = currentName;
            }
        }
        System.out.printf("The total amount of paint required is: %.2f Litres %n", total);
        System.out.println("The name of the shape that requires the most paint is: " + maxName);
        System.out.println("The name of the shape that requires the least paint is: " + minName);
        System.out.println("The number of shapes created is: " + count);
    }
    
}
