package multithreading;


// Implementing Synchronisation using synchronised method
public class Task8 {

    private int count = 0;

    public synchronized void increment(){
        count++;
        System.out.println(Thread.currentThread().getName() + " incremented count to "+count);
    }

    public int getCount(){
        return count;
    }
}

class Main2{
    public static void main(String[] args){
        Task8 s = new Task8();

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
// A synchronized method is a method that is thread-safe, ensuring that only one thread can execute it at a time for
// a given object. Synchronization prevents thread interference and memory consistency errors when multiple threads
// access shared resource