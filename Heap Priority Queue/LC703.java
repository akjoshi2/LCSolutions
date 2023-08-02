// Solution to LeetCode 703: Kth Largest Element in a Stream
// Category: Heap Priority Queue
// Difficulty: Easy

import java.util.PriorityQueue;

public class LC703 {
	final PriorityQueue<Integer> q;
    final int k;

    public LC703(int k, int[] nums) {
        this.k = k;
        q = new PriorityQueue<>(k);
        for (int n: nums)
        {
            add(n);
        }   
    }
    
    public int add(int val) {
        if (q.size() < k)
        {
            q.offer(val);
        }
        else if (q.peek() < val)
        {
            q.poll();
            q.offer(val);
        }
        return q.peek();
    }
}
