public class LC79 {
	public boolean exist(char[][] board, String word) {
        char[] w = word.toCharArray();
        for (int i = 0; i < board.length; i++)
        {
            for (int j = 0; j < board[0].length; j++)
            {
                if (existHelper(board,i,j,w,0))
                {
                    return true;
                }
            }
        }
        return false;
    }
    public boolean existHelper(char[][] board, int i, int j, char[] w, int ind)
    {
        if (ind == w.length)
        {
            return true;
        }
        if (i > board.length-1 || i < 0 || j < 0 || j > board[0].length-1 || board[i][j] != w[ind])
        {
            return false;
        }
        board[i][j]='*';
        boolean res = (existHelper(board,i-1,j,w,ind+1) || existHelper(board,i,j-1,w,ind+1) || existHelper(board,i+1,j,w,ind+1) || existHelper(board,i,j+1,w,ind+1));
        board[i][j] = w[ind];
        return res;
    }
}
