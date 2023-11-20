// Solution to LeetCode 84: Largest Rectangle in Histogram
// Category: Stack
// Difficulty: Hard

import java.util.Stack;

public class LC84 {
	    public int largestRectangleArea(int[] heights) {
        int length = heights.length;
        Stack<Integer> stack = new Stack<>();
        int ans = 0;
        for (int i = 0;i <= length; i++)
        {
            int h = 0;
            if (i != length)
            {
                h = heights[i];
            }
            if (stack.isEmpty() || h >= heights[stack.peek()])
            {
                stack.push(i);
            }
            else
            {
                int tp = stack.pop();
                ans = Math.max(ans, heights[tp] * (stack.isEmpty() ? i : i - 1 - stack.peek()));
                i--;
            }
        }
        return ans;
    }
}
