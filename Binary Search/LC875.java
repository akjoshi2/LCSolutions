// Solution to LeetCode 875: Koko Eating Bananas
// Category: Binary Search
// Difficulty: Medium

public class LC875 {
	public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int max = 1;
        for (int i = 0; i < piles.length; i++)
        {
            if (piles[i] > max)
            {
                max = piles[i];
            }
        }
        int high = max;
        int solution = high;
        while (low < high)
        {
            int mid = low + (high - low) / 2;
            int ans = 0;
            for (int i = 0; i < piles.length; i++)
            {
                ans += ((piles[i] + mid - 1) / mid);
            }
            if (ans > h)
            {
                low = mid + 1;
            }
            else
            {
                high = mid;
                solution = mid;
            }
        }
        return solution;
    }
}
