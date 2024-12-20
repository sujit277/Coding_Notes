package concurrentHashMap;

import java.util.concurrent.ConcurrentHashMap;

public class Test {

    public static void main(String[] args){
        ConcurrentHashMap<String,Integer> map = new ConcurrentHashMap<>();
        map.put("Apple", 1);
        map.put("Banana",2);
        map.put("Orange",3);
        System.out.println("Value of the apple is : " + map.get("Apple"));
        map.put("Apple", 4);
        System.out.println("Updated value for 'Apple': " + map.get("Apple"));
        map.remove("Banana");
        System.out.println("Map after removing 'Banana': " + map);

        // Iterating through the map
        map.forEach((key,value) -> System.out.println(key+ " = "+ value));
    }
}
