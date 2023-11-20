// Solution to LeetCode 3: Longest Substring Without Repeating Characters
// Category: Sliding Window
// Difficulty: Medium

import java.util.HashSet;

public class LC3 {
	public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int left = 0;
        int ans = 0;
        for (int right = 0; right < s.length(); right++)
        {
            char c = s.charAt(right);
            while (set.contains(c))
            {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(c);
            ans = Math.max(ans, right - left + 1);
        }
        return ans;
    }
}
