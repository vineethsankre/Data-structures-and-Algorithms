public class Linkedlist {
    // Node class to represent individual elements in the linked list
    static class Node {
        int data; // Data of the node
        Node next; // Reference to the next node
        
        // Constructor to initialize node with data
        Node(int data) {
            this.data = data; // Initialize node data
            next = null; // Initially, next is null
        }
    }
    
    // Queue class to implement queue using linked list
    static class Queue {
        static Node head = null; // Reference to the head of the queue
        static Node tail = null; // Reference to the tail of the queue
        
        // Method to check if the queue is empty
        public boolean isEmpty() {
            return head == null && tail == null; // If both head and tail are null, queue is empty
        }
        
        // Method to add an element to the end of the queue
        public void add(int data) {
            Node newNode = new Node(data); // Create a new node with the given data
            if (isEmpty()) {
                // If queue is empty, set both head and tail to the new node
                tail = head = newNode;
            } else {
                // If queue is not empty, add the new node to the end of the queue and update tail
                tail.next = newNode;
                tail = newNode;
            }
        }
        
        // Method to remove and return the front element of the queue
        public int remove() {
            if (isEmpty()) {
                // If queue is empty, print a message and return -1
                System.out.println("Queue Underflow");
                return -1;
            }
            int front = head.data; // Store the data of the front node
            if (head == tail) {
                // If there's only one node in the queue, set tail to null
                tail = null;
            }
            head = head.next; // Move head to the next node
            return front; // Return the data of the removed node
        }
        
        // Method to peek at the front element of the queue without removing it
        public int peek() {
            if (isEmpty()) {
                // If queue is empty, print a message and return -1
                System.out.println("Queue Underflow");
                return -1;
            }
            return head.data; // Return the data of the front node
        }   
    }
    
    public static void main(String[] args) {
        Queue q = new Queue(); // Create a new queue
        q.add(10); // Add elements to the queue
        q.add(20);
        q.add(40);
        while (!q.isEmpty()) {
            System.out.println(q.peek()); // Peek at the front element
            q.remove(); // Remove the front element
        }
    }
}

