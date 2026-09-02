class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int n=mat.length;
        int m=mat[0].length;
        int reshape[][]=new int[r][c];
        if(m*n!=r*c)
        {
            return mat;
        }
         int original[]=new int[r*c];
         int index=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
               original[index]=mat[i][j];
               index++;
            }
        } 
         index=0;
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
               reshape[i][j]=original[index];
               index++;
            }
        }
        return reshape;
    }
}