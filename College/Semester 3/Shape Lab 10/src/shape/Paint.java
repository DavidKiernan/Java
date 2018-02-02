package shape;
public class Paint {
    private double areaCovered;

    public Paint(){
        areaCovered=0;
    }

    public Paint(double ac){
        areaCovered=ac;
    }

    public double calcAmount(Shape s){
        double area=0;
        if(s instanceof TwoDShape){
            TwoDShape twd=(TwoDShape) s;
            area= ((TwoDShape)s).getArea()/areaCovered;
        }
        else if(s instanceof ThreeDShape){
            ThreeDShape trd=(ThreeDShape) s;
            area= ((ThreeDShape) s).getArea()/areaCovered;

        }
       return area;
    }
}
