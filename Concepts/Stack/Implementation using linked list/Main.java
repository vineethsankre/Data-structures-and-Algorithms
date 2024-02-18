
public class Main {
    // Node class to represent elements of the stack
    private static class Node {
        int data; // Data of the node
        Node next; // Reference to the next node
        
        // Constructor to initialize node with data
        Node(int data) {
            this.data = data;
            next = null; // Initially next is null
        }
    }

    // Stack class to implement stack using linked list
    static class Stack {
        public static Node head = null; // Head of the stack
        
        // Method to push data onto the stack
        public void push(int data) {
            Node newNode = new Node(data); // Create a new node with the data
            if (head == null) { // If stack is empty
                head = newNode; // Set head to the new node
                return;
            }
            newNode.next = head; // Set the new node's next to the current head
            head = newNode; // Update head to the new node
        }
        
        // Method to check if the stack is empty
        public boolean isEmpty() {
            return head == null; // Stack is empty if head is null
        }
        
        // Method to pop data from the stack
        public int pop() {
            if (isEmpty()) { // If stack is empty
                return -1; // Return -1 to indicate underflow
            }
            Node top = head; // Store current head in a variable
            head = head.next; // Move head to the next node
            return top.data; // Return data of the original head
        }
        
        // Method to peek at the top element of the stack
        public int peek() {
            if (isEmpty()) { // If stack is empty
                return -1; // Return -1 to indicate underflow
            }
            return head.data; // Return data of the head
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack(); // Create a new stack
        
        // Push elements onto the stack
        stack.push(1);
        stack.push(5);
        stack.push(4);
        stack.push(6);

        // Pop and print elements until stack is empty
        while (!stack.isEmpty()) {
            System.out.println(stack.peek()); // Print the top element
            stack.pop(); // Remove the top element
        }
    }
}
