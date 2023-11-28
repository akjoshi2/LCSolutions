# LeetCode 217: Contains Duplicate
# Difficulty: Easy
# Arrays
# Time Complexity: O(n)

from ast import List


class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        elements = set()
        for num in nums:
            if num in elements:
                return True
            elements.add(num)
        return False