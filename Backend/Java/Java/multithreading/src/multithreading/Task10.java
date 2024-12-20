package multithreading;

public class Task10 {
    // Represents two resources
    static final Object lock1 = new Object();
    static final Object lock2 = new Object();
}

class Deadlock {
    public static void main(String[] args){
        Thread t1 = new Thread(()->{
           synchronized (Task10.lock1){
               System.out.println("Thread 1: Locked lock1");
               try{
                   // simulate some work
                   Thread.sleep(100);
               }catch(InterruptedException e){
                   Thread.currentThread().interrupt();
               }
               synchronized (Task10.lock2){
                   System.out.println("Thread 2: Locked lock2");
               }
           }
        });

        Thread t2 = new Thread(()->{
           synchronized (Task10.lock2){
               System.out.println("Thread 2: Locked lock2");
               try{
                   // simulate some work
                   Thread.sleep(100);
               }catch(InterruptedException e){
                   Thread.currentThread().interrupt();
               }
               synchronized (Task10.lock1){
                   System.out.println("Thread 2: Locked lock1");
               }
           }
        });
    }
}
