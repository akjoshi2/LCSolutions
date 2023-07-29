// Solution to LeetCode 155: Min Stack
// Category: Stack
// Difficulty: Medium

import java.util.Stack;

public class LC155 {
	    Stack<Integer> s;
    int min = Integer.MAX_VALUE;

    public LC155() {
        s = new Stack<>();
    }
    
    public void push(int val) {
        if (val <= min)
        {
            s.push(min);
            min = val;
        }
        s.push(val);
    }
    
    public void pop() {
        if (s.peek() == min)
        {
            s.pop();
            min = s.pop();
        }
        else
        {
            s.pop();
        }
    }
    
    public int top() {
        return s.peek();
    }
    
    public int getMin() {
        return min;
    }
}
