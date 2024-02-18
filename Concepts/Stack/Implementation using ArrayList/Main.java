import java.util.ArrayList;

public class Main {
    static class Stack {
        ArrayList<Integer> list = new ArrayList<>(); // ArrayList to store stack elements
        
        // Method to push data onto the stack
        public void push(int data) {
            list.add(data); // Add data to the end of the ArrayList
        }
        
        // Method to check if the stack is empty
        public boolean isEmpty() {
            return list.size() == 0; // Returns true if the ArrayList size is 0, indicating an empty stack
        }
        
        // Method to pop (remove and return) the top element from the stack
        public int pop() {
            if (isEmpty()) {
                return -1; // If stack is empty, return -1 (or throw an exception)
            }
            int top = list.remove(list.size() - 1); // Remove and store the top element from the ArrayList
            return top; // Return the removed element
        }
        
        // Method to peek (return) the top element of the stack without removing it
        public int peep() {
            if (isEmpty()) {
                return -1; // If stack is empty, return -1 (or throw an exception)
            }
            int top = list.get(list.size() - 1); // Get the top element of the ArrayList
            return top; // Return the top element
        }
    }
    
    public static void main(String[] args) {
        Stack stack = new Stack(); // Create an instance of the Stack
        
        stack.push(10); // Push 10 onto the stack
        stack.push(20); // Push 20 onto the stack
        stack.push(40); // Push 40 onto the stack
        
        // Loop until the stack is empty
        while (!stack.isEmpty()) {
            System.out.println(stack.peep()); // Print the top element of the stack
            stack.pop(); // Remove the top element from the stack
        }
    }
}
