// Solution to LeetCode 213: House Robber II
// Category: Dynamic Programming
// Difficulty: Easy


public class LC213 {
	    public int rob(int[] nums) {
        if (nums.length == 1)
        {
            return nums[0];
        }
        return Math.max(houseRobber(nums,0,nums.length-2), houseRobber(nums,1,nums.length-1));
    }

    private int houseRobber(int[] nums, int low, int high)
    {
        int include = 0, exclude = 0;
        for (int i = low; i <= high; i++)
        {
            int inc = include, exc = exclude;
            include = exc + nums[i];
            exclude = Math.max(exc, inc);
        }
        return Math.max(include,exclude);
    }
}
