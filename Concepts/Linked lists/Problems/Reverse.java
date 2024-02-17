public void reverseList(){
    if (head == null || head.next == null){
        return;
    }
    Node prevNode = head;
    Node currNode = head.next;
    
    while(currNode != null){
        Node nextNode = currNode.next;
        // Reverse the link of current node and set it to previous node
        currNode.next = prevNode;
        // Move both nodes one step forward
        prevNode = currNode;
        currNode = nextNode;
    }

    head.next = null;
    head = prevNode;

}