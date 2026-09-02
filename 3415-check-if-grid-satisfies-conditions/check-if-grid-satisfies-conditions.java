class Solution {
    public boolean satisfiesConditions(int[][] grid) {
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[i].length;j++)
            {
                if(i!=grid.length-1 && grid[i+1][j]!=grid[i][j]) return false;//down side
                if(j!=grid[i].length-1 && grid[i][j+1]==grid[i][j]) return false;//right side
            }
        }
        return true;
    }
}