import java.util.Scanner;

// Simple try catch finally block

public class Task1 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter first number");
            int num1 = sc.nextInt();
            System.out.println("Enter second number");
            int num2 = sc.nextInt();
            int result = num1 / num2;
            System.out.println("Result is: "+result);
        }catch (ArithmeticException e){
            System.out.println("Arithmetic exception has happened");
        } finally {
            System.out.println("Calculation is done");
        }
    }
}
