import java.io.IOException;

public class Task3 {

    public static void readFile() throws IOException {
        throw new IOException("Error happened while reading");
    }

    public static void main(String[] args){

        try{
            readFile();
        }catch (IOException e){
            System.out.println("Exception: "+e.getMessage());
        }
    }
}

// Note -
// The throws keyword in Java is used to declare exceptions in the method signature. It indicates that a method might
// throw one or more exceptions during its execution. This allows the caller of the method to handle these exceptions
// properly.
// It is a declaration, not a mechanism to throw an exception
