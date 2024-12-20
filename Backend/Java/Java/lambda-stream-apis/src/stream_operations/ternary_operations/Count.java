package stream_operations.ternary_operations;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Count {

    public static void main(String[] args){
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
        Long count = numbers.stream().count();
        System.out.println(count);
    }
}

//Note - Counts the number of elements in the stream