package shape;
public abstract class Shape {
    
    protected String colour;
    protected double area;

    public Shape(String colourIn){
        colour=colourIn;
        area=0;
    }

    public void print(){
        System.out.println("The colour is: "+ colour );
    }

    public abstract void calcArea();
}
