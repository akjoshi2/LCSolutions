// Solution to LeetCode 322: Coin Change
// Category: Dynamic Programming
// Difficulty: Medium

import java.util.Arrays;

public class LC322 {
	public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount+1];
        if (coins == null || coins.length == 0 || amount == 0)
        {
            return 0;
        }
        dp[0] = 0;
        Arrays.fill(dp,amount+1);
        for (int i = 0; i < coins.length; i++)
        {
            if (coins[i] <= amount)
            {
                dp[coins[i]] = 1;
            }
        }
        for (int i = 1; i < amount + 1; i++)
        {
            for (int j = coins.length - 1; j > -1; j--)
            {
                if (i - coins[j] > 0)
                {
                    dp[i] = Math.min(dp[i-coins[j]] + 1,dp[i]);
                }
            }
        }
        if (dp[amount] != amount + 1)
        {
            return dp[amount];
        }
        else
        {
            return -1;
        }
    }
}
