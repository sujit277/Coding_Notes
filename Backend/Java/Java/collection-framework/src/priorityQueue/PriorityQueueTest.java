package priorityQueue;

import java.util.PriorityQueue;

public class PriorityQueueTest {

    public static void main(String[] args){

        // Create a PriorityQueue
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        // Add elements to the PriorityQueue
        priorityQueue.add(10);
        priorityQueue.add(20);
        priorityQueue.add(15);

        // Print the PriorityQueue
        System.out.println("PriorityQueue: " + priorityQueue);

        // Access the head of the PriorityQueue
        Integer head = priorityQueue.peek();
        System.out.println("Head of the queue: " + head);

        // Remove elements from the PriorityQueue
        Integer removedElement = priorityQueue.poll();
        System.out.println("Removed element: " + removedElement);
        System.out.println("PriorityQueue after poll: " + priorityQueue);

        // Get the size of the PriorityQueue
        int size = priorityQueue.size();
        System.out.println("Size of the PriorityQueue: " + size);

        // Iterate over the elements in the PriorityQueue
        System.out.println("Iterating over the PriorityQueue:");
        for (Integer element : priorityQueue) {
            System.out.println(element);
        }

        // Check if the PriorityQueue contains a specific element
        boolean contains20 = priorityQueue.contains(20);
        System.out.println("Contains 20: " + contains20);

        // Clear all elements from the PriorityQueue
        priorityQueue.clear();
        System.out.println("After clearing, size of the PriorityQueue: " + priorityQueue.size());
    }
}
