package inheritance;

interface Animal4 {
    void eat();
}

interface CanFly {
    void fly();
}

class Bird implements Animal4, CanFly {
    @Override
    public void eat() {
        System.out.println("Eating...");
    }

    @Override
    public void fly() {
        System.out.println("Flying...");
    }
}
public class MultipleInheritance {
    public static void main(String[] args){
        Bird b1 = new Bird();
        b1.eat();
        b1.fly();
    }
}
