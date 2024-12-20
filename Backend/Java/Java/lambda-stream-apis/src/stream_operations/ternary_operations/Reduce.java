package stream_operations.ternary_operations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Reduce {

    public static void main(String[] args){
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
        Optional<Integer> sum = numbers.stream().reduce(Integer::sum);
        sum.ifPresent(System.out::println);
    }
}

//Note - Combines the elements of the stream into a single result.