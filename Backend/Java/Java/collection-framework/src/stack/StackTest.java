package stack;

import java.util.Stack;

public class StackTest {

    public static void main(String[] args){
        // Create a Stack
        Stack<String> stack = new Stack<>();

        // Push elements onto the Stack
        stack.push("Apple");
        stack.push("Banana");
        stack.push("Orange");

        // Print the Stack
        System.out.println("Stack: " + stack);

        // Peek at the top element without removing it
        String topElement = stack.peek();
        System.out.println("Top element: " + topElement);

        // Pop elements from the Stack
        String removedElement = stack.pop();
        System.out.println("Removed element: " + removedElement);
        System.out.println("Stack after pop: " + stack);

        // Check if the Stack is empty
        boolean isEmpty = stack.empty();
        System.out.println("Is the Stack empty? " + isEmpty);

        // Search for an element in the Stack
        int position = stack.search("Banana");
        if (position != -1) {
            System.out.println("Apple is found at position: " + position);
        } else {
            System.out.println("Apple is not found in the Stack");
        }
    }
}
