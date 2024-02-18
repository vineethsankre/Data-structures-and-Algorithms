/*
Initialize two pointers, firstPointer and secondPointer, both initially pointing to a dummy node.
Move secondPointer n nodes ahead.
Move both pointers simultaneously until secondPointer reaches the end of the list.
At this point, firstPointer is pointing to the node before the one to be removed.
Remove the node by adjusting pointers.
Return the head of the modified list.
*/

class DelNfromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        
        ListNode firstPointer = dummy;
        ListNode secondPointer = dummy;
        
        for (int i =0; i<n; i++){
            secondPointer = secondPointer.next;
        }
        
        while(secondPointer.next != null){
            firstPointer = firstPointer.next;
            secondPointer = secondPointer.next;
            
        }
        
        firstPointer.next = firstPointer.next.next;
        
        
        return dummy.next;
    }
}
