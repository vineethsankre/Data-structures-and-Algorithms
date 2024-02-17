public class CreatingLL {
    // Inner static class representing a node in the linked list
    static class Node {
        int data; // Data stored in the node
        Node next; // Reference to the next node in the linked list

        // Constructor to initialize a node with given data
        Node(int data) {
            this.data = data;
        }
    }
    
    public static void main(String[] args) {
        // Creating three nodes with data values 10, 20, and 30
        Node N1 = new Node(10);
        Node N2 = new Node(20);
        Node N3 = new Node(30);

        // Connecting the nodes to form a linked list
        Node head = N1; // Head of the linked list
        head.next = N2; // N1 points to N2
        N2.next = N3; // N2 points to N3
        N3.next = null; // N3 points to null indicating end of the list
    }
}
