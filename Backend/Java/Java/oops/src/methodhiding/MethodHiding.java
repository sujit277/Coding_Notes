package methodhiding;

class Parent {
    public static void methodOne() {
        System.out.println("parent class");
    }
}

class Child extends Parent{
    public static void methodOne() {
        System.out.println("child class");
    }
}

public class MethodHiding {
    public static void main(String[] args){
        Parent p1 = new Parent();
        p1.methodOne();
        Child c = new Child();
        c.methodOne();
        Parent p2 = new Child();
        p2.methodOne();
    }
}
