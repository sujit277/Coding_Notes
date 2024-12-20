package stream_operations.immediate_operations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Filter {

    public static void main(String[] args){
        List<String> names = Arrays.asList("John", "Jane", "Jack", "Doe");
        List<String> filteredNames = names.stream().filter(name -> name.startsWith("J"))
                .collect(Collectors.toList());

        System.out.println(filteredNames);
    }
}

// Note - Filters elements based on a condition.
