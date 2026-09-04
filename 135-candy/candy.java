class Solution {
    public int candy(int[] ratings) {
        int a[]=new int[ratings.length];
        int b[]=new int[ratings.length];
        Arrays.fill(a,1);
        Arrays.fill(b,1);
        for(int i=1;i<ratings.length;i++)
        {
           if(ratings[i]>ratings[i-1])
           {
            a[i]=a[i-1]+1;
           }
        }
         for(int i=ratings.length-2;i>=0;i--)
        {
           if(ratings[i]>ratings[i+1])
           {
            b[i]=b[i+1]+1;
           }
        }
        int ans=0;
        for(int i=0;i<ratings.length;i++)
        {
            ans=ans+Math.max(a[i],b[i]);
        }
        return ans;
    }
}