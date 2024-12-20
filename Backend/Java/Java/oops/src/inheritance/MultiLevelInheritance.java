package inheritance;

class Animal2 {
    void eat() {
        System.out.println("Eating...");
    }
}

class Dog2 extends Animal2 {
    void bark() {
        System.out.println("Barking...");
    }
}

class Puppy2 extends Dog2 {
    void weep() {
        System.out.println("Weeping...");
    }
}

public class MultiLevelInheritance {
    public static void main(String[] args){
        Puppy2 puppy = new Puppy2();
        puppy.eat();
        puppy.bark();
        puppy.weep();
    }
}
