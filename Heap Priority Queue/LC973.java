// Solution to LeetCode 973: K Closest Points
// Category: Heap Priority Queue
// Difficulty: Medium

import java.util.PriorityQueue;

public class LC973 {
	public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((p1,p2) -> p2[0] * p2[0] + p2[1] * p2[1] - p1[0] * p1[0] - p1[1] * p1[1]);
        for (int[] p: points)
        {
            pq.offer(p);
            if (pq.size() > k)
            {
                pq.poll();
            }
        }
        int[][] ans = new int[k][2];
        while (k > 0)
        {
            k--;
            ans[k] = pq.poll();
        }
        return ans;
    }
}
