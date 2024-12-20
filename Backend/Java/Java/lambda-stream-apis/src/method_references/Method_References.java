package method_references;

import java.util.Arrays;
import java.util.List;

public class Method_References {
    public static void main(String[] args){
        List<String> names = Arrays.asList("Peter","Anna","Mike","Xenia");

        // Using method reference
        names.sort(String::compareTo);
        System.out.println(names);
    }
}
