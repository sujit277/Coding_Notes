package linkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapTest {

    public static void main(String[] args){

        // Create a LinkedHashMap
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();

        // Add key-value pairs to the LinkedHashMap
        linkedHashMap.put("Apple", 10);
        linkedHashMap.put("Banana", 20);
        linkedHashMap.put("Orange", 15);

        // Print the LinkedHashMap
        System.out.println("LinkedHashMap: " + linkedHashMap);

        // Add a duplicate key (will overwrite the existing value)
        linkedHashMap.put("Apple", 30);
        System.out.println("After adding duplicate key: " + linkedHashMap);

        // Get the value associated with a key
        int value = linkedHashMap.get("Banana");
        System.out.println("Value for key 'Banana': " + value);

        // Check if the LinkedHashMap contains a specific key
        boolean containsKey = linkedHashMap.containsKey("Orange");
        System.out.println("Contains key 'Orange': " + containsKey);

        // Remove a key-value pair from the LinkedHashMap
        linkedHashMap.remove("Apple");
        System.out.println("After removing key 'Apple': " + linkedHashMap);

        // Get the size of the LinkedHashMap
        int size = linkedHashMap.size();
        System.out.println("Size of the LinkedHashMap: " + size);

        // Iterate over the entries in the LinkedHashMap
        System.out.println("Iterating over the LinkedHashMap:");
        for (Map.Entry<String, Integer> entry : linkedHashMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Clear all key-value pairs from the LinkedHashMap
        linkedHashMap.clear();
        System.out.println("After clearing, size of the LinkedHashMap: " + linkedHashMap.size());
    }
}
