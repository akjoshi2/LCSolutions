# LeetCode 242: Valid Anagram
# Difficulty: Easy
# Arrays
# Time Complexity: O(n)

from collections import defaultdict

class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        freqCount = defaultdict(int)
        for c in s:
            freqCount[c] += 1
        for c in t:
            freqCount[c] -= 1
        for val in freqCount.values():
            if val != 0:
                return False
        return True