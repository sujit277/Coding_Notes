package abstract_classes;

abstract class Animal {
    protected String name;
    public Animal(String name){
        this.name = name;
    }

    // Abstract method( no Implementation)
    public abstract void makeSound();

    // Regular method ( with Implementation)
    public void sleep(){
        System.out.println(name+" is sleeping");
    }
}

class Cat extends Animal {
    Cat(String name){
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(name+ " makes meows sound");
    }
}

public class Abstract {
    public static void main(String[] args){
        Cat c1 = new Cat("Kitty");
        c1.makeSound();
    }
}
