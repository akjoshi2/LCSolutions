// Solution to LeetCode 152: Maximum Product Subarray
// Category: Dynamic Programming
// Difficulty: Medium

public class LC152 {
	public int maxProduct(int[] nums) {
        int len = nums.length;
        int ans = nums[0];
        int left = 0;
        int right = 0;
        for (int i =  0; i < len; i++)
        {
            if (left == 0)
            {
                left = 1;
            }
            left = left * nums[i];
            if (right == 0)
            {
                right = 1;
            }
            right = right * nums[len - 1 - i];
            ans = Math.max(ans, Math.max(left,right));
        }
        return ans;
    }
}