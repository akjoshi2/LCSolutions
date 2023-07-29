// Solution to LeetCode 20: Valid Parentheses
// Category: Stack
// Difficulty: Easy

import java.util.Stack;

public class LC20 {
	    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c: s.toCharArray())
        {
            if (c == '(' || c == '{' || c == '[')
            {
                stack.add(c);
            }
            else if (c == ')')
            {
                if (!stack.isEmpty() && stack.peek() == '(')
                {
                    stack.pop();
                }
                else
                {
                    return false;
                }
            }
            else if (c == ']')
            {
                if (!stack.isEmpty() && stack.peek() == '[')
                {
                    stack.pop();
                }
                else
                {
                    return false;
                }
            }
            else if (c == '}')
            {
                if (!stack.isEmpty() && stack.peek() == '{')
                {
                    stack.pop();
                }
                else
                {
                    return false;
                }
            }
        }
        if (stack.isEmpty())
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
