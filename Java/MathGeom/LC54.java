// Solution to LeetCode 54: Spiral Matrix
// Category: Math/Geometry
// Difficulty: Medium

import java.util.ArrayList;
import java.util.List;

public class LC54 {
	public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<Integer>();
        if (matrix.length ==0 || matrix[0].length == 0)
        {
            return ans;
        }	
        int top = 0;
        int bottom = matrix.length-1;
        int left = 0;
        int right = matrix[0].length-1;
        while (true)
        {
            for (int i = left; i <= right; i++)
            {
                ans.add(matrix[top][i]);
            }
            top++;
            if (left > right || top > bottom)
            {
                break;
            }
            for (int i = top; i <= bottom; i++)
            {
                ans.add(matrix[i][right]);
            }
            right--;
            if (left > right || top > bottom)
            {
                break;
            }
            for (int i = right; i >= left; i--)
            {
                ans.add(matrix[bottom][i]);
            }
            bottom--;
            if (left > right || top > bottom)
            {
                break;
            }
            for (int i = bottom; i >= top; i--)
            {
                ans.add(matrix[i][left]);
            }
            left++;
            if (left > right || top > bottom)
            {
                break;
            }
        }
        return ans;
    }
}