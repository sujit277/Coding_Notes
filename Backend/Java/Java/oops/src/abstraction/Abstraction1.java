package abstraction;

// Abstraction using Abstract classes

abstract class Animal1 {
    // Abstract method
    public abstract void sound();

    // Regular method
    public void sleep(){
        System.out.println("The animal is sleeping");
    }
}

class Dog1 extends Animal1 {
    // Providing implementation for Abstract method
    public void sound(){
        System.out.println("woof");
    }
}

public class Abstraction1 {
    public static void main(String[] args){
        Dog1 dog = new Dog1();
        dog.sound();
    }
}
