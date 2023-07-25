// Solution to LeetCode 76: Minimum Window Substring
// Category: Sliding Window
// Difficulty: Hard

public class LC76 {
	public String minWindow(String s, String t) {
        int[] count = new int[128];
        for (char c: t.toCharArray())
        {
            count[c]++;
        }
        int counter = t.length();
        int start = 0;
        int end = 0;
        int ans = Integer.MAX_VALUE;
        int startPoint = 0;
        int endPoint = 0;
        while (end < s.length())
        {
            if (count[s.charAt(end++)]-- > 0)
            {
                counter--;
            }
            while (counter == 0)
            {
                if (end - start < ans)
                {
                    ans = end - start;
                    startPoint = start;
                    endPoint = end;
                }
                if (count[s.charAt(start++)]++ == 0)
                {
                    counter++;
                }
            }
        }
        return ans == Integer.MAX_VALUE ? "" : s.substring(startPoint,endPoint);
    }
}
