package polymorphism;

class Animal {
    public void makeSound(){
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound(){
        System.out.println("Dog Barks");
    }
}

public class Overriding {
    public static void main(String[] args){
        Animal a1 = new Animal();
        a1.makeSound();
        Animal a2 = new Dog();
        a2.makeSound();
        Dog d1 = new Dog();
        d1.makeSound();
    }
}
