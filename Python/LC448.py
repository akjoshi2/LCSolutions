# LeetCode 448: Find All Numbers Disappeared in an Array
# Difficulty: Easy
# Arrays
# Time Complexity: O(n)

from ast import List


class Solution:
    def findDisappearedNumbers(self, nums: List[int]) -> List[int]:
        ans = []
        for n in nums:
            nums[abs(n)-1] = -abs(nums[abs(n)-1])
        for i in range(len(nums)):
            if nums[i] > 0:
                ans.append(i+1)
        return ans