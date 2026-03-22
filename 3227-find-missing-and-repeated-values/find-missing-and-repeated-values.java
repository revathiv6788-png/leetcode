class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n=grid.length;
        int size=n*n;
        int repeat=0,missing=0;
        boolean visited[]=new boolean[size+1];//why size+1 missing element kku
        for(int row[]:grid)
        {
            for(int num:row)
            {
                if(visited[num])
                {
                    repeat=num;
                }
                visited[num]=true;
            }
        }
        //missing
        for(int i=1;i<=size;i++)
        {
            if(!visited[i])
            {
                missing=i;
                break;
            }
        }
        return new int[]{repeat,missing};
    }
}