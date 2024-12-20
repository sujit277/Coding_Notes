package stream_operations.ternary_operations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ForEach {

    public static void main(String[] args){
        List<String> names  = Arrays.asList("John", "Jack", "Doe", "Jill");
        names.stream().forEach(System.out::print);
    }
}

//Note - Performs an action for each element of the stream.