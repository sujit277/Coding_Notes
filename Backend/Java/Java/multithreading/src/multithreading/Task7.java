package multithreading;

// The currentThread() method in Java is a static method of the Thread class that returns a reference to the currently
// executing thread

public class Task7 {
    public static  void main(String[] args){
        Thread mainThread  = Thread.currentThread();
        System.out.println("Main thread: "+mainThread.getName());

        // Create another thread
        Thread t1 = new Thread(()->{
           System.out.println("Thread: "+ Thread.currentThread().getName());
           try{
               Thread.sleep(1000); //simulate some work
           }catch (InterruptedException e){
               System.out.println("Thread Interrupted");
           }
           System.out.println("Thread Completed");
        });

        t1.start();

        try{
            Thread.sleep(500);
        }catch (InterruptedException e){
            System.out.println("Main Thread Interrupted");
        }
        System.out.println("Main Thread Completed");
    }
}
