class Solution {
    public int numRookCaptures(char[][] board) {
        int count=0;
        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board[i].length;j++)
            {
                if(board[i][j]=='R')
                {
                     for(int u=i-1;u>=0;u--)
        {
            if(board[u][j]=='p')
            {
                count++;
                break;
            }
            if(board[u][j]=='B')break;
        }
        for(int l=j-1;l>=0;l--)
        {
            if(board[i][l]=='p')
            {
                count++;
                break;
            }
            if(board[i][l]=='B')break;
        }
        for(int r=j+1;r<board[i].length;r++)
        {
            if(board[i][r]=='p')
            {
                count++;
                break;
            }
            if(board[i][r]=='B')break;
        }
        for(int d=i+1;d<board.length;d++)
        {
            if(board[d][j]=='p')
            {
                count++;
                break;
            }
            if(board[d][j]=='B')break;
        }
                }
            }
        }
        return count;
    }
}
