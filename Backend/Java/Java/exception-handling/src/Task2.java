public class Task2 {

    public static void validateAge(int age){
        if(age < 18){
            throw new IllegalArgumentException("Age must be 18 or above");
        }
    }

    public static void main(String[] args){
        try{
            validateAge(17);
        }catch (IllegalArgumentException e){
            System.out.println("Exception: "+e.getMessage());
        }
    }
}

// Note -
// The throw keyword in Java is used to explicitly throw an exception. It can be used to throw both checked and
// unchecked exceptions. After throwing the exception, the execution of the program stops at the point where the
// exception is thrown unless it is caught and handled.