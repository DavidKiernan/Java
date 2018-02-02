package rectangle;

/**
 *
 * @author David
 */
public class Rectangle {
  private double length;
  private double width;
  
  public void setLength(double lengthOfRectangle) {
    length = lengthOfRectangle;
  }
  //Getter Methods//
  public double getLength() {
    return length;
  }
  
  public void setWidth(double widthOfRectangle){
    width = widthOfRectangle;
  }
  
   //Getter Methods//
  public double getWidth() {
    return width;
  }
  
  //the method to print out//
  public void print(){
    System.out.println("Length is " + length);
    System.out.println("Width Of Rectangle : " + width);
  }
}
