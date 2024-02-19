import java.util.Queue;
import java.util.ArrayDeque;

public class JCF {
    public static void main(String[] args) {
        Queue<Integer> q = new ArrayDeque<>(); // Creating a queue using ArrayDeque
        
        // Adding elements to the queue
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        
        // Processing elements in the queue
        while (!q.isEmpty()) { // Loop until the queue is empty
            System.out.println(q.peek()); // Peek at the front element of the queue
            q.remove(); // Remove the front element of the queue
        }
    }
}
