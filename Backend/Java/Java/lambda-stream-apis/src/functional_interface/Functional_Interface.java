package functional_interface;

@FunctionalInterface
interface Functional_Interface_Test {
    void show();
}

public class Functional_Interface {
    public static void main(String[] args){
        Functional_Interface_Test test = () -> System.out.println("Functional Interface");
        test.show();
    }
}
