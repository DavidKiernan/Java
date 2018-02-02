package pet;

import java.util.Scanner;

/**
 *
 * @author David
 */
public class TestPet {
    public static void main(String[] args){
    
        Scanner in=new Scanner(System.in);
    
        Pet pet1= new Pet();


        String name;
        int age, heightFeet,heightInch,height;
        double weightPound, weightOunce,weight;


        pet1.setName ("Fido");
        pet1.setAge (2);
        pet1.setWeight (4,6);
        pet1.setHeight (1,1);


        System.out.println("The Name of the Pet " +pet1.getName());
        System.out.println("The Age of Pet Is " +pet1.getAge() +" Years");
        System.out.println("The Weight of Pet Is " +pet1.getWeight() +" Ounces");
        System.out.println("The Weight of Pet " +pet1.getHeight() +" Inches");
        System.out.println("The Pet is " +pet1.isHealthy());

        System.out.println("Enter The Pet Name");
        name=in.next();

        System.out.println("Enter Age Of Pet");
        age=in.nextInt();

        System.out.println("Enter Height (Feet) Of Pet");
        heightFeet=in.nextInt();

        System.out.println("Enter Height (Inch) Of Pet");
        heightInch=in.nextInt();

        System.out.println("The Pound Weight Of Pet");
        weightPound=in.nextDouble();

        System.out.println("The Ounce Weight Of Pet");
        weightOunce=in.nextDouble();

        weight=(weightPound*16)+weightOunce;
        height=(heightFeet*12)+heightInch;

        Pet pet2= new Pet(name,age,weight,height);

        System.out.println("The Name of the Pet " +pet2.getName());
        System.out.println("The Age of Pet Is " +pet2.getAge() +" Years");
        System.out.println("The Weight of Pet Is " +pet2.getWeight() +" Ounces");
        System.out.println("The Weight of Pet " +pet2.getHeight() +" Inches");
        System.out.println("The Pet is " +pet2.isHealthy());


    }
}
