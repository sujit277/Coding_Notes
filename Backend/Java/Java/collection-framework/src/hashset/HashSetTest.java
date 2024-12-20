package hashset;

import java.util.HashSet;

public class HashSetTest {

    public static void main(String[] args){

        // Create a HashSet
        HashSet<String> hashSet = new HashSet<>();

        // Add elements to the HashSet
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Orange");

        // Print the HashSet
        System.out.println("HashSet: " + hashSet);

        // Add a duplicate element (will not be added)
        hashSet.add("Apple");
        System.out.println("After adding duplicate element: " + hashSet);

        // Check if the HashSet contains a specific element
        boolean containsApple = hashSet.contains("Apple");
        System.out.println("Contains Apple: " + containsApple);

        // Remove an element from the HashSet
        hashSet.remove("Banana");
        System.out.println("After removing Banana: " + hashSet);

        // Get the size of the HashSet
        int size = hashSet.size();
        System.out.println("Size of the HashSet: " + size);

        // Iterate over the elements in the HashSet
        System.out.println("Iterating over the HashSet:");
        for (String fruit : hashSet) {
            System.out.println(fruit);
        }

        // Clear all elements from the HashSet
        hashSet.clear();
        System.out.println("After clearing, size of the HashSet: " + hashSet.size());
    }
}
