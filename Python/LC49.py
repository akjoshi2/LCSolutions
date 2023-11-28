# LeetCode 49: Group Anagrams
# Difficulty: Medium
# Arrays
# Time Complexity: O(n*klog(k))

from ast import List
from collections import defaultdict


class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        anmap = defaultdict(list)
        for word in strs:
            sortword = ''.join(sorted(word))
            anmap[sortword].append(word)
        return list(anmap.values())