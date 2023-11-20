// Solution to Leetcode 217: Contains Duplicate
// Category: Arrays and Hashing
// Difficulty: Easy

import java.util.HashMap;
 
public class LC217 {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++)
        {
            if (!map.containsKey(nums[i]))
            {
                map.put(nums[i],0);
            }
            else
            {
                return true;
            }
        }
        return false;
    }
}