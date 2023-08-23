// Solution to LeetCode 143: Reorder List
// Category: Linked List
// Difficulty: Medium

import LinkList.LC206.ListNode;

public class LC143 {
	    public void reorderList(ListNode head) {
        if (head == null || head.next == null)
        {
            return;
        }
        ListNode prev = null;
        ListNode slow = head;
        ListNode fast = head;
        ListNode l1 = head;
        while (fast != null && fast.next != null)
        {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next = null;

        ListNode l2 = reverse(slow);
        merge(l1,l2);
    }
    ListNode reverse(ListNode head)
    {
        ListNode newHead = null;
        while (head != null)
        {
            ListNode after = head.next;
            head.next = newHead;
            newHead = head;
            head = after;
        }
        return newHead;
    }
    void merge(ListNode head1, ListNode head2)
    {
        while (head2 != null) {
            ListNode next = head1.next;
            head1.next = head2;
            head1 = head2;
            head2 = next;
        }
    }
}
