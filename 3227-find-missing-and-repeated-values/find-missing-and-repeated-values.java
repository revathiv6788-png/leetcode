class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        // int[] arr=new int[n*n];
        // for(int i=0i<n;i++)
        // {
        //     for(int j=0;j<m;j++)
        //     {
        //         arr[]=grid[i][j];
        //     }
        // }
        // Arrays.sort(arr);
        // for(int i=1;i<=arr.length;i++)
        // {
        //     if(arr[i]==arr[])
        // }
        boolean a[]=new boolean[n*n];
        int ans[]=new int[2];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(a[grid[i][j]-1]) //a[grid[i][j]-1]check index 
                ans[0]=grid[i][j];
                else
                a[grid[i][j]-1]=true;
            }
        }
        for(int i=0;i<a.length;i++)
        {
            if(!a[i])
            {
                ans[1]=i+1;
            }
        }
        return ans;
    }
}