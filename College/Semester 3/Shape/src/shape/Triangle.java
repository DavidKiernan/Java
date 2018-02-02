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
public class Triangle extends Shape{
    private double base;
    private double height;

    public Triangle(String colour, double b, double h){
        super(colour);
        base=b;
        height=h;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Triangle Base: "+base+" Height: "+height);
    }

    @Override
    public void calcArea() {
        area = 0.5*base * height;
        System.out.println("Area: "+area);
    }
}
