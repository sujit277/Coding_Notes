package stream_operations.immediate_operations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Map {
    public static void main(String[] args){
        List<String> names = Arrays.asList("John", "Spider", "Jack", "Oswald");
        List<Integer> nameLengths = names.stream().map(String::length)
                .collect(Collectors.toList());
        System.out.println(nameLengths);
    }
}

// Note - Transforms each element to another object using a function.
