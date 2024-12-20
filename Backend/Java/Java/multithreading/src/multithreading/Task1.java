package multithreading;

// Creating a Thread using a thread class

public class Task1 extends Thread{
    public void run(){
        int x = 0;
        while(x<100){
            System.out.println("Running: "+ x++);
        }
    }

    public static void main(String[] args){
        System.out.println("begin main");
        Task1 t1 = new Task1();
        t1.start();
        int y = 0;
        while (y < 100){
            System.out.println("end main: "+ y++);
        }
    }
}

//Note  -
// start - Starts a new thread and executes the run() method.
// run - Contains the code to be executed by the thread. It's invoked when start() is called

