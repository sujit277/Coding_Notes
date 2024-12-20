package lambda_expression;

import java.util.Arrays;
import java.util.List;

public class Lambda {
    public static void main(String[] args){
        List<Integer> numbers = Arrays.asList(1,2,4,3,7,6,5,8,9,0);

        // Using lambda function for comparator
        numbers.sort((Integer a, Integer b) -> {
            return a.compareTo(b);
        });

        // Using concise lambda function for comparator
        numbers.sort((a,b)-> a.compareTo(b));
        System.out.println(numbers);
    }
}
