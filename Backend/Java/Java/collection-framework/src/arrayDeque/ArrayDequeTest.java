package arrayDeque;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeTest {

    public static void main(String[] args){

        // Create an ArrayDeque
        Deque<String> deque = new ArrayDeque<>();

        // Add elements to the ArrayDeque
        deque.add("Apple");
        deque.add("Banana");
        deque.add("Orange");

        // Print the ArrayDeque
        System.out.println("ArrayDeque: " + deque);

        // Add elements at the beginning and end of the ArrayDeque
        deque.addFirst("FirstElement");
        deque.addLast("LastElement");
        System.out.println("After adding elements at first and last: " + deque);

        // Access elements from the ArrayDeque
        String firstElement = deque.getFirst();
        String lastElement = deque.getLast();
        System.out.println("First element: " + firstElement);
        System.out.println("Last element: " + lastElement);

        // Remove elements from the ArrayDeque
        deque.removeFirst();
        deque.removeLast();
        System.out.println("After removing first and last elements: " + deque);

        // Get the size of the ArrayDeque
        int size = deque.size();
        System.out.println("Size of the ArrayDeque: " + size);

        // Iterate over the elements in the ArrayDeque
        System.out.println("Iterating over the ArrayDeque:");
        for (String fruit : deque) {
            System.out.println(fruit);
        }

        // Check if the ArrayDeque contains a specific element
        boolean hasApple = deque.contains("Apple");
        System.out.println("Contains Apple: " + hasApple);

        // Clear all elements from the ArrayDeque
        deque.clear();
        System.out.println("After clearing, size of the ArrayDeque: " + deque.size());
    }
}
