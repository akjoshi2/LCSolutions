// Solution to LeetCode 11: Container With Most Water
// Category: Two Pointers
// Difficulty: Medium

public class LC11 {
	public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int ans = 0;
        while (left < right)
        {
            int curr = Math.min(height[left],height[right]) * (right-left);
            if (curr > ans)
            {
                ans = curr;
            }
            if (height[left] > height[right])
            {
                right--;
            }
            else
            {
                left++;
            }
        }
        return ans;
    }
}
