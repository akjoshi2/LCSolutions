// Solution to LeetCode 238: Product of Array Except Self
// Category: Arrays and Hashing
// Difficulty: Medium

public class LC238 {
	public int[] productExceptSelf(int[] nums) {
		int[] sol = new int[nums.length];
		int prefix = 1;
		for (int i = 0; i < nums.length; i++)
		{
			sol[i] = prefix;
			prefix *= nums[i];
		}
		int postfix = 1;
		for (int i = nums.length-1; i >= 0; i--)
		{
			sol[i] *= postfix;
			postfix *= nums[i];
		}
		return sol;
	}
}
