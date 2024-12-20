package multithreading;

// Implementing Synchronisation using synchronised block
public class Task9 {

    private int count = 0;

    public synchronized void increment(){
        synchronized (this){
            count++;
            System.out.println(Thread.currentThread().getName() + " incremented count to "+count);
        }
    }

    public int getCount(){
        return count;
    }
}

class Main3{
    public static void main(String[] args){
        Task9 s = new Task9();

        //creating multiple threads to access shared resource
        Thread t1 = new Thread(()->{
            for(int i=0; i<5; i++){
                s.increment();
            }
        }, "Thread-1");


        Thread t2 = new Thread(()->{
            for(int i=0; i<5; i++){
                s.increment();
            }
        }, "Thread-2");

        t1.start();
        t2.start();
    }
}

// Note -
// It allows you to synchronize only a specific portion of a method, making it more efficient than synchronizing the
// entire method.

