package linkedList;

import java.util.LinkedList;

public class LinkedListTest {

    public static void main(String[] args){

        // Create a LinkedList
        LinkedList<String> linkedList = new LinkedList<>();

        // Add elements to the LinkedList
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");

        // Print the LinkedList
        System.out.println("LinkedList: " + linkedList);

        // Add elements at specific positions
        linkedList.addFirst("FirstElement");
        linkedList.addLast("LastElement");
        System.out.println("After adding elements at first and last: " + linkedList);

        // Access elements from the LinkedList
        String firstElement = linkedList.getFirst();
        String lastElement = linkedList.getLast();
        System.out.println("First element: " + firstElement);
        System.out.println("Last element: " + lastElement);

        // Modify elements in the LinkedList
        linkedList.set(1, "Mango");
        System.out.println("Updated LinkedList: " + linkedList);

        // Remove elements from the LinkedList
        linkedList.removeFirst();
        linkedList.removeLast();
        System.out.println("After removing first and last elements: " + linkedList);

        // Get the size of the LinkedList
        int size = linkedList.size();
        System.out.println("Size of the LinkedList: " + size);

        // Iterate over the elements in the LinkedList
        System.out.println("Iterating over the LinkedList:");
        for (String fruit : linkedList) {
            System.out.println(fruit);
        }

        // Check if the LinkedList contains a specific element
        boolean hasApple = linkedList.contains("Apple");
        System.out.println("Contains Apple: " + hasApple);

        // Clear all elements from the LinkedList
        linkedList.clear();
        System.out.println("After clearing, size of the LinkedList: " + linkedList.size());
    }
}
