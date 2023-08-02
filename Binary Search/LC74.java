// Solution to LeetCode 74: Search a 2D Matrix
// Category: Binary Search
// Difficulty: Medium

public class LC74 {
	    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int low = 0;
        int high = (rows*cols)-1;
        while (low <= high)
        {
            int mid = low + (high - low) / 2;
            int rowIndex = mid / cols;
            int colIndex = mid % cols;
            int val = matrix[rowIndex][colIndex];
            if (val == target)
            {
                return true;
            }
            else if (val < target)
            {
                low = mid + 1;
            }
            else
            {
                high = mid - 1;
            }
        }
        return false;
    }
}