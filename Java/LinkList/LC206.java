// Solution to LeetCode 206: Reverse Linked List
// Category: Linked List
// Difficulty: Easy

public class LC206 {
	public ListNode reverseList(ListNode head)
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
	public class ListNode {
		int val;
		ListNode next;
		ListNode() {}
		ListNode(int val) { this.val = val; }
		ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	}
}