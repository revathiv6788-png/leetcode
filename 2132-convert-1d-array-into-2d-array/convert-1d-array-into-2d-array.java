class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        if(m*n!=original.length)
        {
            return new int[][]{};
        }
        int reshape[][]=new int[m][n];
        int index=0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                 reshape[i][j]=original[index];
                 index++;
            }
        }
        return reshape;
    }
}