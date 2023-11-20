// Solution to LeetCode 19: Remove Nth Node From End of List
// Category: Linked List
// Difficulty: Medium

public class LC19 {
	public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = new ListNode(0);
        temp.next = head;
        ListNode p1 = temp;
        ListNode p2 = temp;
        if (head == null || head.next == null)
        {
            return null;
        }
        while (n > 0)
        {
            p2 = p2.next;
            n--;
        }
        while (p2 != null && p2.next != null)
        {
            p1 = p1.next;
            p2 = p2.next;
        }
        p1.next = p1.next.next;
        return temp.next;
    }
	public class ListNode {
		int val;
		ListNode next;
		ListNode() {}
		ListNode(int val) { this.val = val; }
		ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	}
}