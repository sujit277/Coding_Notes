public class Task5 {
    public static void main(String[] args){
        try{
            ArithmeticException cause = new ArithmeticException("Division by zero");
            RuntimeException runException =  new RuntimeException("Error occurred in calculation");
            runException.initCause(cause);
            throw runException;
        }catch (RuntimeException e){
            System.out.println("Caught Exception: "+ e.getMessage());
            System.out.println("Original Cause: "+ e.getCause().getMessage());
        }
    }
}

// Note -
// This mechanism allows us to keep one exception object as a data member of another exception object
// initCause(Throwable ob) :- This method will accept an object of any exception class and keeps within the exception
// object that invokes it.
// getCause() :- This method will return an object that available within the exception object that invokes it.