package stream_operations.immediate_operations;

import java.util.List;
import java.util.stream.Collectors;

public class FlatMap {
    public static void main(String[] args){
        List<List<String>> listOfLists = List.of(
                List.of("A", "B"),
                List.of("C", "D"),
                List.of("E", "F")
        );

        List<String> flatList = listOfLists.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());

        System.out.println(flatList);  // Output: [A, B, C, D, E, F]
    }
}

// FlatMap
// The flatMap() method is used when each element of the stream is itself a collection or stream. It applies a
// transformation to each element and flattens the nested structures into a single stream.

