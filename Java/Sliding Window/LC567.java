// Solution to LeetCode 567: Permutation in String
// Category: Sliding Window
// Difficulty: Medium

public class LC567 {
	public boolean checkInclusion(String s1, String s2) {
        int[] count = new int[26];
        for (char c: s1.toCharArray())
        {
            count[c-'a']++;
        }
        int start = 0;
        int end = 0;
        int counter = s1.length();
        while (end < s2.length())
        {
            if (count[s2.charAt(end++)-'a']-- > 0)
            {
                counter--;
            }
            if (counter == 0)
            {
                return true;
            }
            if (end - start == s1.length() && count[s2.charAt(start++) - 'a']++ >= 0)
            {	
                counter++;
            }
        }
        return false;
    }
}
