// Solution to LeetCode 5: Longest Palindromic Substring
// Category: Dynamic Programming
// Difficulty: Medium

public class LC5 {
	public String longestPalindrome(String s) {
        int len = s.length();
        String ans = null;
        boolean[][] dp = new boolean[len][len];
        for (int i = len - 1; i >= 0; i--)
        {
            for (int j = i; j < len; j++)
            {
                dp[i][j] = s.charAt(i) == s.charAt(j) && (j - i < 3 || dp[i+1][j-1]);
                if (dp[i][j] && (ans == null || j - i + 1 > ans.length()))
                {
                    ans = s.substring(i, j + 1);
                }
            }
        }
        return ans;
    }
}
