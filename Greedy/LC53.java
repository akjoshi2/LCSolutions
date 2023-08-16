// Solution to LeetCode 53: Maximum Subarray
// Category: Greedy
// Difficulty: Medium

public class LC53 {
	public int maxSubArray(int[] nums) {
        int len = nums.length;
        int[] dp = new int[len];
        dp[0] = nums[0];
        int ans = dp[0];
        for (int i = 1; i < len; i++)
        {
            dp[i] = nums[i] + (dp[i-1] > 0 ? dp[i - 1] : 0);
            ans = Math.max(ans, dp[i]);
        }
        return ans;
    }
}