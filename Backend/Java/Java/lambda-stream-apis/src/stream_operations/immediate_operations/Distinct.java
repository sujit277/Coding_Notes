package stream_operations.immediate_operations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Distinct {
    public static void main(String[] args){
        List<String> names = Arrays.asList("John", "Jane", "Jack" ,"John", "John", "Jack", "Doe");
        List<String> distinctNames = names.stream().distinct()
                .collect(Collectors.toList());

        System.out.println(distinctNames);
    }
}

//Note - Removes duplicate elements.
