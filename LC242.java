// Solution to Leetcode 242: Valid Anagram
// Category: Arrays and Hashing
// Difficulty: Easy

import java.util.Arrays;

public class LC242 {
    public boolean isAnagram(String s, String t) {
        char[] aryS = s.toCharArray();
        char[] aryT = t.toCharArray();
        Arrays.sort(aryS);
        Arrays.sort(aryT);
        return Arrays.equals(aryS,aryT);
    }
}