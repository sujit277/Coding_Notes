package stream_operations.ternary_operations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Collect {

    public static void main(String[] args){
        List<String> names  = Arrays.asList("John", "Jack", "Doe", "Jill");
        List<String> collectedNames = names.stream().collect(Collectors.toList());
        System.out.println(collectedNames);
    }
}

//Note - Collects the elements of the stream into a collection.
