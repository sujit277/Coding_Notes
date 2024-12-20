package vector;

import java.util.Vector;

public class VectorTest {

    public static void main(String[] args){

        // Create a Vector
        Vector<String> vector = new Vector<>();

        // Add elements to the Vector
        vector.add("Apple");
        vector.add("Banana");
        vector.add("Orange");

        // Print the Vector
        System.out.println("Vector: " + vector);

        // Access elements from the Vector
        String firstElement = vector.get(0);
        System.out.println("First element: " + firstElement);

        // Modify elements in the Vector
        vector.set(1, "Mango");
        System.out.println("Updated Vector: " + vector);

        // Remove elements from the Vector
        vector.remove(2);
        System.out.println("After removing the third element: " + vector);

        // Get the size of the Vector
        int size = vector.size();
        System.out.println("Size of the Vector: " + size);

        // Iterate over the elements in the Vector
        System.out.println("Iterating over the Vector:");
        for (String fruit : vector) {
            System.out.println(fruit);
        }

        // Check if the Vector contains a specific element
        boolean hasApple = vector.contains("Apple");
        System.out.println("Contains Apple: " + hasApple);

        // Clear all elements from the Vector
        vector.clear();
        System.out.println("After clearing, size of the Vector: " + vector.size());
    }
}
