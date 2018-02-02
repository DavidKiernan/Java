package animal;
public class TestAnimal {
    public static void main(String[] args) {
        
        Dog myDog = new Dog();
        Cat myCat = new Cat();

        myDog.setName("Jake");
        myCat.setName("Fluff");

        System.out.print(myDog.getName() + " says ");
        myDog.speak();
        System.out.print(myCat.getName() + " says ");
        myCat.speak();
    }
    
}
