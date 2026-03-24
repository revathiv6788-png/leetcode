class Solution {
    public void backtrack(int[][] grid,int sr,int sc,int color,int value)
    {
        if(sr<0||sr>=grid.length||sc<0||sc>=grid[0].length||grid[sr][sc]!=value)
        {
            return;
        }
        grid[sr][sc]=color;//important
        backtrack(grid,sr+1,sc,color,value);
        backtrack(grid,sr,sc+1,color,value);
        backtrack(grid,sr-1,sc,color,value);
        backtrack(grid,sr,sc-1,color,value);
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int value=image[sr][sc];
        if(value==color)
        {
             return image;
        }
        if(image.length==0)
        {
            return image;
        }
         backtrack(image,sr,sc,color,value);
         return image;
    }
}