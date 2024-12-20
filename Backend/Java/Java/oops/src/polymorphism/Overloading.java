package polymorphism;

class MathOperation {
    public int add(int a, int b){
        return a+b;
    }

    public int add(int a, int b, int c){
        return a+b+c;
    }

    public int add(int a, int b, int c, int d){
        return a+b+c+d;
    }
}

public class Overloading {
    public static void main(String[] args){
        MathOperation m1 = new MathOperation();
        System.out.println("Sum of 2 and 3 is "+ m1.add(2,3));
        System.out.println("Sum of 2, 8 and 3 is "+ m1.add(2,8,3));
        System.out.println("Sum of 2, 8, 9 and 3 is "+ m1.add(2,8,9,3));
    }
}
