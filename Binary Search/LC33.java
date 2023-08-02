// Solution to LeetCode 33: Search in Rotated Sorted Array
// Category: Binary Search
// Difficulty: Medium

public class LC33 {
	public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length -1;
        while (low < high)
        {
            int mid = low + (high - low) / 2;
            if (nums[mid] > nums[high])
            {
                low = mid + 1;
            }
            else
            {
                high = mid;
            }
        }

        int rotation = low;
        low = 0;
        high = nums.length;
        while (low <= high)
        {
            int mid = low + (high - low) / 2;
            int middle = (mid + rotation) % nums.length;
            if (nums[middle] == target)
            {
                return middle;
            }
            else if (nums[middle] < target)
            {
                low = mid + 1;
            }
            else
            {
                high = mid - 1;
            }
        }
        return -1;
    }
}
