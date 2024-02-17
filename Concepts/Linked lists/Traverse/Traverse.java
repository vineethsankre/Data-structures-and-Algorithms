public class Traverse {
    // Inner static class representing a node in the linked list
    static class Node<TreeNode> {
        TreeNode data; // Data stored in the node
        Node<TreeNode> next; // Reference to the next node in the linked list
        
        // Constructor to initialize a node with given data
        Node(TreeNode data) {
            this.data = data;
        }
    }

    // Main method to demonstrate traversal of the linked list
    public static void main(String[] args) {
        // Create a linked list and traverse it
        Node<Integer> head = new Node<>(10);
        head.next = new Node<>(20);
        head.next.next = new Node<>(30);

        // Call the traverse method with the head of the linked list
        traverse(head);
    }

    // Method to traverse the linked list and print its elements
    static void traverse(Node<Integer> head) {
        Node<Integer> curr = head; // Start from the head of the linked list

        // Iterate through the linked list until curr becomes null (end of the list)
        while (curr != null) {
            // Print the data of the current node
            System.out.println(curr.data);
            // Move to the next node in the list
            curr = curr.next;
        }
    }
}


