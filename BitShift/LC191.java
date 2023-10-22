// Solution to LeetCode 191: Number of 1 Bits
// Category: Bit Manipulation
// Difficulty: Easy


public class LC191 {
	public int hammingWeight(int n) {
        int ans = 0;
        while (n != 0) 
        {
            if ((n & 1) == 1)
            {
                ans++;
            }
            n = n >>> 1;
        }
        return ans;
    }
}
