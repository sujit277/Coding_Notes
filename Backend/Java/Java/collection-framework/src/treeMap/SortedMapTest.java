package treeMap;

import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapTest {

    public static void main(String[] args){

        // Create a TreeMap (implementation of SortedMap)
        SortedMap<String, Integer> sortedMap = new TreeMap<>();

        // Add key-value pairs to the TreeMap
        sortedMap.put("Banana", 20);
        sortedMap.put("Apple", 10);
        sortedMap.put("Orange", 15);

        // Print the TreeMap (sorted by keys)
        System.out.println("SortedMap (TreeMap): " + sortedMap);

        // Get the value associated with a key
        int value = sortedMap.get("Banana");
        System.out.println("Value for key 'Banana': " + value);

        // Check if the TreeMap contains a specific key
        boolean containsKey = sortedMap.containsKey("Orange");
        System.out.println("Contains key 'Orange': " + containsKey);

        // Remove a key-value pair from the TreeMap
        sortedMap.remove("Apple");
        System.out.println("After removing key 'Apple': " + sortedMap);

        // Get the size of the TreeMap
        int size = sortedMap.size();
        System.out.println("Size of the TreeMap: " + size);

        // Iterate over the entries in the TreeMap (sorted order)
        System.out.println("Iterating over the TreeMap:");
        for (Map.Entry<String, Integer> entry : sortedMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Get a submap from "Apple" (inclusive) to "Orange" (exclusive)
        SortedMap<String, Integer> subMap = sortedMap.subMap("Apple", "Orange");
        System.out.println("Submap from 'Apple' to 'Orange' (exclusive): " + subMap);

        // Clear all key-value pairs from the TreeMap
        sortedMap.clear();
        System.out.println("After clearing, size of the TreeMap: " + sortedMap.size());
    }
}
