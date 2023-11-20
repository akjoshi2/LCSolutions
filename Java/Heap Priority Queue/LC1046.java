// Solution to LeetCode 1046: Last Stone Weight
// Category: Heap Priority Queue
// Difficulty: Easy

import java.util.PriorityQueue;

public class LC1046 {
	public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> q = new PriorityQueue<>((a,b) -> b - a);
        for (int n : stones)
        {
            q.offer(n);
        }
        while (q.size() > 1)
        {
            q.offer(q.poll() - q.poll());
        }
        return q.poll();
    }
}
