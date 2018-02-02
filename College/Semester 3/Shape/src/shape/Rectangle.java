/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shape;

/**
 *
 * @author David
 */
public class Rectangle  extends Shape{
    private double length;
    private double width;

    public Rectangle(String colour,double len,double wid){
        super(colour);
        length=len;
        width=wid;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Rectangle Length: "+length+" Width: "+width);
    }

    @Override
    public void calcArea() {
        area = length * width;
        System.out.println("Area: "+area);
    }
}
