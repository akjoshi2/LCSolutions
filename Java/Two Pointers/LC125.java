// Solution to LeetCode 125: Valid Palindrome
// Category: Two Pointers
// Difficulty: Easy

public class LC125 {
	public boolean isPalindrome(String s) {
        if (s.isEmpty())
        {
            return true;
        }
        int startIndex = 0;
        int endIndex = s.length()-1;
        while (startIndex < endIndex)
        {
            char start = s.charAt(startIndex);
            char end = s.charAt(endIndex);
            if (!Character.isLetterOrDigit(start))
            {
                startIndex++;
            }
            else if (!Character.isLetterOrDigit(end))
            {
                endIndex--;
            }
            else
            {
                if (Character.toLowerCase(start) != Character.toLowerCase(end))
                {
                    return false;
                }
                startIndex++;
                endIndex--;
            }
        }   
        return true;
    }
}
