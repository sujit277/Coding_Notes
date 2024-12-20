package Iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Test {
    public static void main(String[] args){

        List<String> names = new ArrayList<>(Arrays.asList("Alice", "Bob", "Charlie", "David"));

        Iterator<String> iterator = names.iterator();

        //  hasNext() to check if there are more elements to iterate over.
        while(iterator.hasNext()){
            // next() is used to retrieve the next element.
            String name = iterator.next();
            System.out.println("Name "+ name);

            if(name.equals("Bob")){
                // remove() is called to remove the element from the list while iterating.
                iterator.remove();
            }
        }
        System.out.println("List after removal "+ names);
    }
}
