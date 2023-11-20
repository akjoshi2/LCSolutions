// Solution to LeetCode 215: Kth Largest Element in Array
// Category: Heap Priority Queue
// Difficulty: Medium

import java.util.PriorityQueue;

public class LC215 {
	public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < nums.length; i++)
        {
            pq.offer(nums[i]);
            if (pq.size() > k)
            {
                pq.poll();
            }
        }
        return pq.peek();
    }
}
