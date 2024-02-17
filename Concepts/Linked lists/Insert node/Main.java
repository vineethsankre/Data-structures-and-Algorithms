public class Main {
    static class Node {
        int data; // Data stored in the node
        Node next; // Reference to the next node

        Node(int data) { // Constructor to initialize a node with given data
            this.data = data;
        }
    }
    
    public static void main(String[] args) {
        // Create nodes with data values
        Node N1 = new Node(10);
        Node N2 = new Node(20);
        Node N3 = new Node(30);
        Node N4 = new Node(50);
        Node N5 = new Node(60);

        // Connect nodes to form a linked list
        Node head = N1; 
        head.next = N2; 
        N2.next = N3; 
        N3.next = N4;
        N4.next = N5;
        N5.next = null;

        insert(3, head, 40); // Insert 40 at position 3
    }

    static void insert(int data, Node head, int pos){
        Node toAdd = new Node(data);

        // Base condition: insert at the beginning
        if (pos == 0){
            toAdd.next = head;
            head = toAdd;
            return;
        }

        Node prev = head;
        for (int i = 0; i< pos - 1; i++){
            prev = prev.next;
        }
        toAdd.next = prev.next;
        prev.next = toAdd;
    }
}
