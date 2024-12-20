
// User defined Exception

class InvalidAgeException extends Exception{
    InvalidAgeException(String message){
        super(message);
    }
}

public class Task4 {

    public static void validateAge(int age) throws InvalidAgeException {
        throw new InvalidAgeException("Age must be 18 or above");
    }

    public static void main(String[] args){

        try{
            validateAge(17);
        }catch (InvalidAgeException e){
            System.out.println("Exception: "+ e.getMessage());
        }
    }
}
