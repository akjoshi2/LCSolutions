// Solution to LeetCode 36: Valid Sudoku
// Category: Arrays and Hashing
// Difficulty: Medium

import java.util.HashSet;

public class LC36 {
	public boolean isValidSudoku(char[][] board) {
        int rows = board.length;
        int cols = board[0].length;
        HashSet<String> boardSet = new HashSet<>();
        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < cols; j++)
            {
                if (board[i][j] != '.')
                {
                    if (!boardSet.add(board[i][j] + "R" + i) 
                        || !boardSet.add(board[i][j] + "C" + j)
                        || !boardSet.add(board[i][j] + "B" + i/3 + j/3))
                    {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
