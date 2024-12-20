package multithreading;

// Sleep - The Thread.sleep() method in Java is used to pause the execution of the current
// thread for a specified amount of time (in milliseconds)

public class Task5 {

    public static void main(String[] args){
        System.out.println("Starting the thread");
        try{
            Thread.sleep(2000);
        }catch(InterruptedException e){
            System.out.println("Thread interrupted exception");
        }
        System.out.println("Ending the thread");
    }
}
