// Solution to LeetCode 239: Sliding Window Maximum
// Category: Sliding Window
// Difficulty: Hard

import java.util.ArrayDeque;
import java.util.Deque;

public class LC239
{
	public int[] maxSlidingWindow(int[] nums, int k) {
		
		int n = nums.length;
		int[] ans = new int[n-k+1];
		int ansIndex = 0;
		Deque<Integer> queue = new ArrayDeque<>();
		for (int i = 0; i < nums.length; i++)
		{
			while (!queue.isEmpty() && queue.peek() < i - k + 1)
			{
				queue.poll();
			}
			while (!queue.isEmpty() && nums[queue.peekLast()] < nums[i])
			{
				queue.pollLast();
			}
			queue.offer(i);
			if (i >= k - 1)
			{
				ans[ansIndex++] = nums[queue.peek()];
			}
		}
		return ans;
	}
}
