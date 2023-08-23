// Solution to LeetCode 141: Linked List Cycle
// Category: Linked List
// Difficulty: Easy

import LinkList.LC206.ListNode;

public class LC141 {
	    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast)
            {
                return true;
            }
        }
        return false;
    }
}
