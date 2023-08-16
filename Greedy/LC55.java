// Solution to LeetCode 55: Jump Game
// Category: Greedy
// Difficulty: Medium

public class LC55 {
	public boolean canJump(int[] nums) {
        int end = nums.length - 1;
        for (int i = end - 1; i >=0; i--)
        {
            if (i + nums[i] >= end)
            {
                end = i;
            }
        }
        return end <= 0;
    }
}
