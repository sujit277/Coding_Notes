package inheritance;

class Animal1 {
    void eat() {
        System.out.println("Eating...");
    }
}

class Dog1 extends Animal1 {
    void bark() {
        System.out.println("Barking...");
    }
}

public class SingleInheritance {
    public static void main(String[] args){
        Animal1 a1 = new Animal1();
        a1.eat();
        Dog1 d1 = new Dog1();
        d1.bark();
    }
}
