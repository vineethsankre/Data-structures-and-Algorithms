public class Main {
    Node head; // Reference to the first node
    int size; // Size of the linked list

    Main() {
        size = 0;
    }

    // Node class to represent each element of the linked list
    public class Node {
        String data; // Data of the node
        Node next; // Reference to the next node

        Node(String data) {
            this.data = data;
            this.next = null;
            size++; // Increment size when a new node is created
        }
    }

    // Method to add a new node at the beginning of the list
    public void addFirst(String data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Method to add a new node at the end of the list
    public void addLast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    // Method to print the elements of the list
    public void printList() {
        Node currNode = head;

        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("null");
    }

    // Method to remove the first node from the list
    public void removeFirst() {
        if (head == null) {
            System.out.println("Empty List");
            return;
        }
        head = head.next;
        size--;
    }

    // Method to remove the last node from the list
    public void removeLast() {
        if (head == null) {
            System.out.println("Empty List");
            return;
        }
        size--;
        if (head.next == null) {
            head = null;
        }

        Node currNode = head;
        Node lastNode = head.next;

        while (lastNode.next != null) {
            currNode = currNode.next;
            lastNode = lastNode.next;
        }
        currNode.next = null;
    }

    // Method to get the size of the list
    public int getSize() {
        return size;
    }

    public static void main(String[] args) {
        Main list = new Main();
        list.addLast("is");
        list.addLast("a");
        list.addLast("list");
        list.printList();

        list.addFirst("this");
        list.printList();
        System.out.println(list.getSize());

        list.removeFirst();
        list.printList();

        list.removeLast();
        list.printList();
    }
}
