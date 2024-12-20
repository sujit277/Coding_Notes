package interfaces;

interface Animal{

    // Interfaces methods are implicitly public and abstract
    void makeSound();
    default void sleep(){
        System.out.println("The Animal is sleeping");
    }
    static void eat(){
        System.out.println("The Animal is eating");
    }
}

class Dog implements Animal{

    @Override
    public void makeSound() {
        System.out.println("The Dog is making Sound");
    }

    @Override
    public void sleep() {
        System.out.println("The Dog is sleeping");
    }
}

public class Interface {
    public static void main(String[] args){
        Dog d1 = new Dog();
        d1.makeSound();
        d1.sleep();
    }
}
