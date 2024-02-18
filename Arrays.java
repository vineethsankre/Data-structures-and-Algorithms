public class Arrays {
    static class Queue {
        int arr[];
        int size;
        int rear;

        Queue(int size) {
            this.size = size;
            arr = new int[size];
            rear = -1;
        }

        public boolean isEmpty() { // Removed static keyword
            return rear == -1;
        }

        public boolean isFull() { // Removed static keyword
            return rear == size - 1;
        }

        public int deQueue() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            int front = arr[0];
            for (int i = 0; i < rear; i++) {
                arr[i] = arr[i + 1];
            }
            rear--;
            return front;
        }

        public void enQueue(int data) {
            if (isFull()) {
                System.out.println("Queue is full");
                return;
            }
            arr[++rear] = data;
        }

        public int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[0];
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.enQueue(10);
        q.enQueue(20);
        q.enQueue(40);
        System.out.println(q.deQueue());
        System.out.println(q.peek());
    }
}
