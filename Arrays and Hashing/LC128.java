// Solution to LeetCode 128: Longest Consecutive Sequence
// Category: Arrays and Hashing
// Difficulty: Medium

import java.util.HashSet;

public class LC128 {
	public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++)
        {
            set.add(nums[i]);
        }
        int maxLen = 0;
        for (int i = 0; i < nums.length; i++)
        {
            int currMaxLen = 1;
            if (!set.contains(nums[i]-1))
            {
                int currentElement = nums[i];
                while (set.contains(currentElement+1))
                {
                    currentElement = currentElement + 1;
                    currMaxLen++;
                }
                maxLen = Math.max(maxLen, currMaxLen);
            }
        }
        return maxLen;
    }
}
