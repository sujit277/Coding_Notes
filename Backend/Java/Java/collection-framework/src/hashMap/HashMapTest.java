package hashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {

    public static void main(String[] args){

        // Create a HashMap
        HashMap<String, Integer> hashMap = new HashMap<>();

        // Add key-value pairs to the HashMap
        hashMap.put("Apple", 10);
        hashMap.put("Banana", 20);
        hashMap.put("Orange", 15);

        // Print the HashMap
        System.out.println("HashMap: " + hashMap);

        // Add a duplicate key (will overwrite the existing value)
        hashMap.put("Apple", 30);
        System.out.println("After adding duplicate key: " + hashMap);

        // Get the value associated with a key
        int value = hashMap.get("Banana");
        System.out.println("Value for key 'Banana': " + value);

        // Check if the HashMap contains a specific key
        boolean containsKey = hashMap.containsKey("Orange");
        System.out.println("Contains key 'Orange': " + containsKey);

        // Remove a key-value pair from the HashMap
        hashMap.remove("Apple");
        System.out.println("After removing key 'Apple': " + hashMap);

        // Get the size of the HashMap
        int size = hashMap.size();
        System.out.println("Size of the HashMap: " + size);

        // Iterate over the entries in the HashMap
        System.out.println("Iterating over the HashMap:");
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Clear all key-value pairs from the HashMap
        hashMap.clear();
        System.out.println("After clearing, size of the HashMap: " + hashMap.size());
    }
}
