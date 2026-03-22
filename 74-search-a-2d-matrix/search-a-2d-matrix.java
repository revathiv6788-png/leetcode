class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        // for(int row[]:matrix)//o(m*n)
        // {
        //     for(int num:row)
        //     {
        //         if(num==target)
        //         {
        //             return true;
        //         }
        //     }
        // }
        // return false;


        //o(log(m*n))binary search
        int m=matrix.length;
        int n=matrix[0].length;
        //int size=m*n-1;
        int left=0;
        int right=m*n-1;
        while(left<=right)
        {
            int mid=(left+right)/2;
            int row=mid/n;
            int col=mid%n;
            if(matrix[row][col]==target)
            {
                return true;
            }
            else if(matrix[row][col]<target)
            {
                left=mid+1;
            }
            else
            {
                right=mid-1;
            }
        }
        return false;
    }
}