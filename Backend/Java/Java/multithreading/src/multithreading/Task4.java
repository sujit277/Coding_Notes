package multithreading;

// Create a Daemon Thread

public class Task4 {
    public static void main(String[] args){
        Thread daemonThread = new Thread(()->{
           while(true){
               System.out.println("Daemon thread is running");
               try{
                   //simulate work
                   Thread.sleep(500);
               }catch(InterruptedException e){
                   Thread.currentThread().interrupt();
               }
           }
        });

        //set the thread as daemon thread
        daemonThread.setDaemon(true);

        daemonThread.start();

        try{
            Thread.sleep(1000);
        }catch(InterruptedException e){
            Thread.currentThread().interrupt();
        }

        System.out.println("Main thread is finished");
    }
}

// Note -
// Daemon threads are used for background tasks like garbage collection, monitoring, etc.
// setDaemon(true) must be called before the thread is started; otherwise, it throws an IllegalThreadStateException.