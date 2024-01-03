# LeetCode 268: Missing Number
# Difficulty: Easy
# Arrays
# Time Complexity: O(n)

from ast import List


class Solution:
    def missingNumber(self, nums: List[int]) -> int:
        return (len(nums) * (len(nums) + 1) // 2 - sum(nums))