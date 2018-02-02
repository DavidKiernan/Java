package shape;
public class Rectangle extends Shape{
    
    private double length, width;
 
    public Rectangle(double l, double w)
    { 
             this.length = l; 
             this.width = w;
             numShapes++;
    }

    @Override
     public double area()
     { 
           return (length * width); 
     }

    @Override
     public double perimeter()
     { 
           return (2 * ( length + width )); 
     }
}
