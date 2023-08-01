// Solution to LeetCode 739: Daily Temperatures
// Category: Stack
// Difficulty: Medium

import java.util.Stack;

public class LC739 {
	    public int[] dailyTemperatures(int[] temperatures) {
        int[] ans = new int[temperatures.length];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < temperatures.length; i++)
        {
            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()])
            {
                int index = stack.pop();
                ans[index] = i - index;
            }
            stack.push(i);
        }
        return ans;
    }
}
