package inheritance;

class Animal3 {
    void eat() {
        System.out.println("Eating...");
    }
}

class Dog3 extends Animal3 {
    void bark() {
        System.out.println("Barking...");
    }
}

class Cat3 extends Animal3 {
    void meow() {
        System.out.println("Meowing...");
    }
}
public class HierarchicalInheritance {
    public static void main(String[] args){
        Dog3 dog = new Dog3();
        Cat3 cat = new Cat3();
        dog.eat();
        dog.bark();
        cat.eat();
        cat.meow();
    }
}
