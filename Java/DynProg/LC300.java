// Solution to LeetCode 300: Longest Increasing Subsequence
// Category: Dynamic Programming
// Difficulty: Medium

import java.util.Arrays;

public class LC300 {
	public int lengthOfLIS(int[] nums) {
        int[] dp = new int[nums.length+1];
        int ans = 0;
        for (int n: nums)
        {
            int i = Arrays.binarySearch(dp, 0, ans, n);
            if (i < 0)
            {
                i = -(i+1);
            }
            dp[i] = n;
            if (i == ans)
            {
                ans++;
            }
        }
        return ans;
    }
}
