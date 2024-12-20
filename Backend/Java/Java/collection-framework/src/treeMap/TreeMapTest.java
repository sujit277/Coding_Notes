package treeMap;

import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapTest {

    public static void main(String[] args){

        // Create a TreeMap
        TreeMap<String, Integer> treeMap = new TreeMap<>();

        // Add key-value pairs to the TreeMap
        treeMap.put("Banana", 20);
        treeMap.put("Apple", 10);
        treeMap.put("Orange", 15);

        // Print the TreeMap (sorted by keys)
        System.out.println("TreeMap: " + treeMap);

        // Add a duplicate key (will overwrite the existing value)
        treeMap.put("Apple", 30);
        System.out.println("After adding duplicate key: " + treeMap);

        // Get the value associated with a key
        int value = treeMap.get("Banana");
        System.out.println("Value for key 'Banana': " + value);

        // Check if the TreeMap contains a specific key
        boolean containsKey = treeMap.containsKey("Orange");
        System.out.println("Contains key 'Orange': " + containsKey);

        // Remove a key-value pair from the TreeMap
        treeMap.remove("Apple");
        System.out.println("After removing key 'Apple': " + treeMap);

        // Get the size of the TreeMap
        int size = treeMap.size();
        System.out.println("Size of the TreeMap: " + size);

        // Iterate over the entries in the TreeMap (sorted order)
        System.out.println("Iterating over the TreeMap:");
        for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Get a submap from "Apple" (inclusive) to "Orange" (exclusive)
        SortedMap<String, Integer> subMap = treeMap.subMap("Apple", "Orange");
        System.out.println("Submap from 'Apple' to 'Orange' (exclusive): " + subMap);

        // Clear all key-value pairs from the TreeMap
        treeMap.clear();
        System.out.println("After clearing, size of the TreeMap: " + treeMap.size());
    }
}
