package arrayList;

import java.util.ArrayList;

public class ArrayListTest {

    public static void main(String[] args){
        // Create an ArrayList
        ArrayList<String> fruits = new ArrayList<>();

        // Add elements to the ArrayList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        // Print the ArrayList
        System.out.println("Fruits: " + fruits);

        // Access elements from the ArrayList
        String firstFruit = fruits.get(0);
        System.out.println("First fruit: " + firstFruit);

        // Modify elements in the ArrayList
        fruits.set(1, "Mango");
        System.out.println("Updated Fruits: " + fruits);

        // Remove elements from the ArrayList
        fruits.remove(2);
        System.out.println("After removing the third fruit: " + fruits);

        // Get the size of the ArrayList
        int size = fruits.size();
        System.out.println("Size of the ArrayList: " + size);

        // Iterate over the elements in the ArrayList
        System.out.println("Iterating over the ArrayList:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Check if the ArrayList contains a specific element
        boolean hasApple = fruits.contains("Apple");
        System.out.println("Contains Apple: " + hasApple);

        // Clear all elements from the ArrayList
        fruits.clear();
        System.out.println("After clearing, size of the ArrayList: " + fruits.size());
    }
}
