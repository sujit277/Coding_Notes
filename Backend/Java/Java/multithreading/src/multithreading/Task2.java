package multithreading;

// If we overload the run() in our class, then the start() will never call the overloaded run() rather it will execute
//the overridden run().

public class Task2 extends Thread{

    public void run(){
        System.out.println("I am run");
    }

    public void run(int p){
        System.out.println("I am overloaded run");
    }

    public static void main(String [] args){
        Task2 a2 = new Task2();
        a2.start();
    }

}
