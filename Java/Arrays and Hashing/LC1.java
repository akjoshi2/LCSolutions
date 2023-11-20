// Solution to LeetCode 1: Two Sum
// Category: Arrays and Hashing
// Difficulty: Easy

import java.util.HashMap;

public class LC1 {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++)
        {
            if (map.containsKey(target-nums[i]))
            {
                ans[0] = i;
                ans[1] = map.get(target-nums[i]);
                return ans;
            }
            map.put(nums[i],i);
        }
        return ans;
    }
}