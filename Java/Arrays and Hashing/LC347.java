// Solution to LeetCode 347: Top K Frequent Elements
// Category: Arrays and Hashing
// Difficulty: Medium

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class LC347 {
    public int[] topKFrequent(int[] nums, int k) {
        int[] sol = new int[k];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int n: nums)
        {
            map.put(n, map.getOrDefault(n,0) + 1);
        }
        PriorityQueue<Map.Entry<Integer,Integer>> pq = new PriorityQueue<>((x,y) -> y.getValue() - x.getValue());
        for (Map.Entry<Integer,Integer> entry: map.entrySet())
        {
            pq.add(entry);
        }
        for (int i = 0; i < k; i++)
        {
            sol[i] = pq.poll().getKey();
        }
        return sol;
    }
}