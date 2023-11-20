// Solution to LeetCode 139: Word Break
// Category: Dynamic Programming
// Difficulty: Medium

import java.util.List;

public class LC139 {
	    public boolean wordBreak(String s, List<String> wordDict) 
    {
        int len = s.length();
        boolean[] dp = new boolean[len + 1];
        dp[0] = true;

        for (int i = 1; i <= len; i++) 
        {
            for (String word : wordDict) 
            {
                int wordLen = word.length();
                if (i >= wordLen && dp[i - wordLen] && 
                s.substring(i - wordLen, i).equals(word)) 
                {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[len];
    }
}
