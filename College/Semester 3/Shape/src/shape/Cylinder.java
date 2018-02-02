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
public class Cylinder extends Circle{
    private double height;
    private double volume;

    public Cylinder(String colour, double radius, double h){
        super(colour,radius);
        height=h;
        volume=0;
    }
    @Override
    public void print() {
        super.print();
        System.out.println("Cylinder Height: "+height);
    }

    @Override
    public void calcArea() {
        area = (2*3.14*radius*radius)+(2*3.14*radius*height);
        System.out.println("Area: "+area);
    }

    public void calcVolume(){
        volume=3.14*radius*radius*height;
        System.out.println("Volume: "+volume);
    }
}
