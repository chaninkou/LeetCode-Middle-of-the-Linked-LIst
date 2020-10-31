package leetcode876;

public class FindMiddleOfLinkedListFunction {
	// Simple problem with just slow pointer and fast pointer
    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        
        while(fast != null && fast.next != null){
            slow = slow.next;
            
            fast = fast.next.next;
        }
        
        return slow;
    }
}
