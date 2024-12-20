package abstraction;

// Abstraction using Interfaces

interface Animal {
    // Abstract method
    void sound();

    // Default method (with Implementation)
    default void sleep(){
        System.out.println("The animal is sleeping");
    }
}

class Cat implements Animal {
    // Implementing Abstract method
    public void sound(){
        System.out.println("Moew");
    }
}

public class Abstraction2 {
    public static void main(String[] args){
        Cat cat = new Cat();
        cat.sound();
    }
}
