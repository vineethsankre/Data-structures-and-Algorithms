
public class Palindrome {

    public ListNode findMiddle(ListNode head){
        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    public ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        ListNode forw = null;

        while (curr!=null){
            forw = curr.next;
            curr.next = prev;
            prev = curr;
            curr = forw;
        }
        return prev;
    }
    
    public boolean isPalindrome(ListNode head){
        if (head.next == null || head == null){
            return true;
        }

        ListNode middle = findMiddle(head);
        ListNode secondHalfStart = reverse(middle.next);
        ListNode firstHalfStart = head;

        while(secondHalfStart !=null){
            if (firstHalfStart.val != secondHalfStart.val){
                return false;
            }
            firstHalfStart=firstHalfStart.next;
            secondHalfStart = secondHalfStart.next;
        }
        return true;
    }
}
