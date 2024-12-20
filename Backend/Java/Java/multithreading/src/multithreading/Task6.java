package multithreading;

// The join() method in Java is used to make one thread wait for the completion of another thread. It allows the main
// thread (or any thread calling join) to wait until the thread on which join() is called has finished its execution.

// The isAlive() method in Java is a method of the Thread class that checks whether a thread is alive or not. A
// thread is considered alive if it has been started (using the start() method) and has not yet completed its execution.

public class Task6 {
    public static void main(String[] args){
        Thread thread = new Thread(()->{
            try{
                System.out.println("Thread is running");
                Thread.sleep(2000);
                System.out.println("Thread finished work");
            }catch(InterruptedException e){
                System.out.println("thread was interrupted");
            }
        });

        System.out.println("before starting: is Thread live: "+ thread.isAlive());

        thread.start();

        System.out.println("After starting: is thread alive: "+ thread.isAlive());

        try {
            thread.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread was interrupted.");
        }

        // Check if the thread is alive after completion
        System.out.println("After completion: Is thread alive? " + thread.isAlive());
    }
}
