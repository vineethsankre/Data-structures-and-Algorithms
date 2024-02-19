public class CircularQueue {
    static class Queue {
        static int arr[]; // Array to store elements of the circular queue
        static int size; // Size of the circular queue
        static int front = -1; // Index of the front element
        static int rear = -1; // Index of the rear element
        
        // Constructor to initialize the circular queue with a given size
        Queue(int size) {
            this.size = size; // Set the size of the circular queue
            arr = new int[this.size]; // Initialize the array to store queue elements
        }
        
        // Method to check if the circular queue is empty
        public static boolean isEmpty() {
            return rear == -1 && front == -1; // If both front and rear are -1, queue is empty
        }

        // Method to check if the circular queue is full
        public static boolean isFull() {
            return (rear + 1) % size == front; // If next position of rear is equal to front, queue is full
        }
        
        // Method to add an element to the circular queue
        public static void add(int data) {
            if (isFull()) {
                System.out.println("Overflow! Can't add element to the queue."); // Print overflow message if queue is full
                return;
            }
            if (front == -1) {
                front = 0; // If queue is empty, set front to 0
            }
            rear = (rear + 1) % size; // Update rear circularly
            arr[rear] = data; // Add data to rear position
        }
        
        // Method to remove and return the front element from the circular queue
        public static int remove() {
            if (isEmpty()) {
                System.out.println("Underflow! Can't remove element from the queue."); // Print underflow message if queue is empty
                return -1;
            }
            int res = arr[front]; // Store front element
            if (front == rear) {
                front = rear = -1; // If there's only one element in the queue, set front and rear to -1
            } else {
                front = (front + 1) % size; // Update front circularly
            }
            return res; // Return the removed element
        }
        
        // Method to peek at the front element of the circular queue without removing it
        public static int peek() {
            if (isEmpty()) {
                System.out.println("Underflow! Can't remove element from the queue."); // Print underflow message if queue is empty
                return -1;
            }
            return arr[front]; // Return the front element
        }
    }
    
    public static void main(String[] args) {
        Queue q = new Queue(5); // Create a circular queue of size 5
        q.add(10); // Add elements to the queue
        q.add(20);
        q.add(40);
        System.out.println(q.remove()); // Remove and print the front element
        while (!q.isEmpty()) { // Print remaining elements in the queue
            System.out.println(q.remove());
        }
    }
}
