package treeSet;

import java.util.TreeSet;

public class TreeSetTest {

    public static void main(String[] args){

        // Create a TreeSet
        TreeSet<String> treeSet = new TreeSet<>();

        // Add elements to the TreeSet
        treeSet.add("Banana");
        treeSet.add("Apple");
        treeSet.add("Orange");

        // Print the TreeSet
        System.out.println("TreeSet: " + treeSet);

        // Add a duplicate element (will not be added)
        treeSet.add("Apple");
        System.out.println("After adding duplicate element: " + treeSet);

        // Access the first and last elements
        String firstElement = treeSet.first();
        String lastElement = treeSet.last();
        System.out.println("First element: " + firstElement);
        System.out.println("Last element: " + lastElement);

        // Remove an element from the TreeSet
        treeSet.remove("Banana");
        System.out.println("After removing Banana: " + treeSet);

        // Get the size of the TreeSet
        int size = treeSet.size();
        System.out.println("Size of the TreeSet: " + size);

        // Iterate over the elements in the TreeSet
        System.out.println("Iterating over the TreeSet:");
        for (String fruit : treeSet) {
            System.out.println(fruit);
        }

        // Check if the TreeSet contains a specific element
        boolean containsApple = treeSet.contains("Apple");
        System.out.println("Contains Apple: " + containsApple);

        // Get a subset of the TreeSet
        TreeSet<String> subSet = (TreeSet<String>) treeSet.subSet("Apple", "Orange");
        System.out.println("Subset from Apple to Orange (exclusive): " + subSet);

        // Clear all elements from the TreeSet
        treeSet.clear();
        System.out.println("After clearing, size of the TreeSet: " + treeSet.size());
    }
}
