class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int n=mat.length;
        int m=mat[0].length;
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            int count=0;
            for(int j=0;j<m;j++)
            {
                if(mat[i][j]==0)
                break;
                count++;
            }
            arr[i]=count;
        }
        int[] result = new int[k];
        boolean[] used = new boolean[n];
        for (int x = 0; x < k; x++) {
            int min = Integer.MAX_VALUE;
            int index = 0;
            for (int i = 0; i < n; i++) {
                if (!used[i] && arr[i] < min) {
                    min = arr[i];
                    index = i;
                }
            }
            result[x] = index;
            used[index] = true;
        }
        return result; 
    }
}