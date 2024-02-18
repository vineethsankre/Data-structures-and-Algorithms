class Reorder {
    public ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        ListNode forw = null;
        
        while(curr != null){
            forw = curr.next;
            curr.next= prev;
            prev = curr;
            curr = forw;
        }
        
        return prev;
    }
    
    public void reorderList(ListNode head) {
        // Step 1 - using slow and fast pointer approach to find the mid of the list
        ListNode fast = (head != null) ? head.next: null;
        ListNode slow = head;
        
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        
        // Step 2 - reverse the second half and split the list into two
        ListNode second = reverse(slow != null ? slow.next : null);
        if (slow != null){
            slow.next = null;
        }
        ListNode first = head;
        
        // Step 3 - merge the two lists
        while(second != null){
            ListNode temp1 = first.next;
            ListNode temp2 = second.next;
            first.next = second;
            second.next = temp1;
            first = temp1;
            second = temp2;
        }
        
    }
}