// Solution to LeetCode 121: Best Time to Buy and Sell Stock
// Category: Sliding Window
// Difficulty: Easy


public class LC121 {
	public int maxProfit(int[] prices) {
        int prof = 0;
        int min = prices[0];
        for (int i = 1; i < prices.length; i++)
        {
            if (prices[i] < min)
            {
                min = prices[i];
            }
            else if (prices[i] - min > prof)
            {
                prof = prices[i] - min;
            }
        }
        return prof;
	}
}
