// Solution to LeetCode 150: Evaluate Reverse Polish Notation
// Category: Stack
// Difficulty: Medium

import java.util.Stack;

public class LC150 {
	    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (String s: tokens)
        {
            int bot;
            int top;
            int ans;
            if (s.equals("+"))
            {
                bot = stack.pop();
                top = stack.pop();
                ans = top + bot;
                stack.push(ans);
            }
            else if (s.equals("-"))
            {
                bot = stack.pop();
                top = stack.pop();
                ans = top - bot;
                stack.push(ans);
            }
            else if (s.equals("*"))
            {
                bot = stack.pop();
                top = stack.pop();
                ans = top * bot;
                stack.push(ans);
            }
            else if (s.equals("/"))
            {
                bot = stack.pop();
                top = stack.pop();
                ans = top / bot;
                stack.push(ans);
            }
            else
            {
                stack.push(Integer.parseInt(s));
            }
        }
        return stack.peek();
    }
}
