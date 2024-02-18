public class Arrays {
    static class Queue {
        int arr[];
        int size;
        int rear;

        // Constructor to initialize the queue with a given size
        Queue(int size) {
            this.size = size; // Set the size of the queue
            arr = new int[size]; // Initialize the array to store queue elements
            rear = -1; // Initialize rear pointer to -1 indicating an empty queue
        }

        // Method to check if the queue is empty
        public boolean isEmpty() {
            return rear == -1; // If rear is -1, the queue is empty
        }

        // Method to check if the queue is full
        public boolean isFull() {
            return rear == size - 1; // If rear is equal to size - 1, the queue is full
        }

        // Method to remove and return the front element of the queue
        public int deQueue() {
            if (isEmpty()) {
                System.out.println("Queue is empty"); // If queue is empty, print a message
                return -1; // Return -1 indicating failure
            }
            int front = arr[0]; // Store the front element
            for (int i = 0; i < rear; i++) {
                arr[i] = arr[i + 1]; // Shift elements to the left to remove the front element
            }
            rear--; // Decrease the rear pointer
            return front; // Return the removed element
        }

        // Method to add an element to the rear of the queue
        public void enQueue(int data) {
            if (isFull()) {
                System.out.println("Queue is full"); // If queue is full, print a message
                return; // Return without adding the element
            }
            arr[++rear] = data; // Increment rear and add the element to the rear of the queue
        }

        // Method to return the front element of the queue without removing it
        public int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty"); // If queue is empty, print a message
                return -1; // Return -1 indicating failure
            }
            return arr[0]; // Return the front element
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(5); // Create a queue of size 5
        q.enQueue(10); // Add elements to the queue
        q.enQueue(20);
        q.enQueue(40);
        System.out.println(q.deQueue()); // Remove and print the front element
        System.out.println(q.peek()); // Print the front element without removing it
    }
}
