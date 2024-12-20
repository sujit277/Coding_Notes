package multithreading;

//Overriding the start method, It will override the start method implementation

public class Task3 extends Thread{

    @Override
    public void start(){
        System.out.println("Hi start");
    }

    public void run(){
        int x = 0;
        while( x < 6){
            System.out.print("Running"+ x++);
        }
    }
}

class Main1{
    public static void main(String[] args){
        System.out.println("Begin main");
        Task3 t3 = new Task3();
        t3.start();
        System.out.println("end main");
    }
}
