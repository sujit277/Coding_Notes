package stream_operations.immediate_operations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Sorted {
    public static void main(String[] args){
        List<String> names = Arrays.asList("John", "Jane", "Jack", "Doe");
        List<String> sortedNames = names.stream().sorted()
                .collect(Collectors.toList());

        System.out.println(sortedNames);
    }
}

// Note -  Sorts the elements of the stream
