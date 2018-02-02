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
public class Circle extends Shape{
    protected double radius;

    public Circle(String colour, double r){
        super(colour);
        radius=r;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Circle radius: "+radius);
    }

    @Override
    public void calcArea() {
        area = 3.14*radius * radius;
        System.out.println("Area: "+area);
    }
}
