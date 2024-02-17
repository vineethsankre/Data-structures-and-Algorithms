/*Prev will hold the previous value becuase, if we break the link. So, we will not lose our linked list

Similarly nextNode will point to the next pointer after curr. So, that once link is broken we will not lose our remaining linked list.

Once curr reaches null our prev will be on our new head. So, we will return our prev as the answer.
*/
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

