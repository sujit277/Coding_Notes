package inheritance;

class A {
    public void show(){
        System.out.println("A");
    }
}

class B extends A{
    public void show(){
        System.out.println("B");
    }
}

class C extends A{
    public void show(){
        System.out.println("C");
    }
}

class D extends B{
    public void show(){
        System.out.println("D");
    }
}

public class HybridInheritance {
    public static void main(String[] args){
        D d1 = new D();
        d1.show();
    }
}
