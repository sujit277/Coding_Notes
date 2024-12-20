package linkedHashSet;

import java.util.LinkedHashSet;

public class LinkedHashSetTest {

    public static void main(String[] args){

        // Create a LinkedHashSet
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();

        // Add elements to the LinkedHashSet
        linkedHashSet.add("Apple");
        linkedHashSet.add("Banana");
        linkedHashSet.add("Orange");

        // Print the LinkedHashSet
        System.out.println("LinkedHashSet: " + linkedHashSet);

        // Add a duplicate element (will not be added)
        linkedHashSet.add("Apple");
        System.out.println("After adding duplicate element: " + linkedHashSet);

        // Check if the LinkedHashSet contains a specific element
        boolean containsApple = linkedHashSet.contains("Apple");
        System.out.println("Contains Apple: " + containsApple);

        // Remove an element from the LinkedHashSet
        linkedHashSet.remove("Banana");
        System.out.println("After removing Banana: " + linkedHashSet);

        // Get the size of the LinkedHashSet
        int size = linkedHashSet.size();
        System.out.println("Size of the LinkedHashSet: " + size);

        // Iterate over the elements in the LinkedHashSet
        System.out.println("Iterating over the LinkedHashSet:");
        for (String fruit : linkedHashSet) {
            System.out.println(fruit);
        }

        // Clear all elements from the LinkedHashSet
        linkedHashSet.clear();
        System.out.println("After clearing, size of the LinkedHashSet: " + linkedHashSet.size());
    }
}
