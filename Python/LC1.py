# LeetCode 1: Two Sum
# Difficulty: Easy
# Arrays
# Time Complexity: O(n)

class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        elements = {}
        for i in range(len(nums)):
            complement = target - nums[i]
            if complement in elements:
                return [elements[complement], i]
            elements[nums[i]] = i
        return []