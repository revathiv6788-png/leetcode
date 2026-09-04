class Solution {
    public int trap(int[] height) {
    //   Queue<Integer> left=new PriorityQueue<>();  
    //   Queue<Integer> right=new PriorityQueue<>(Collections.reverseOrder());
    //   for(int num:height)
    //   {
    //     left.add(num);
    //   }
    //   for(int num:height)
    //   {
    //     right.
    //   }

         int a[]=new int[height.length];
         int b[]=new int[height.length];
         a[0]=height[0];
         for(int i=1;i<height.length;i++)
         {
             a[i]=Math.max(height[i],a[i-1]);
         }
         b[height.length-1]=height[height.length-1];
         for(int i=height.length-2;i>=0;i--)
         {
            b[i]=Math.max(height[i],b[i+1]);
         }
         int sum=0;
         for(int i=0;i<height.length;i++)
         {
            sum=sum+(Math.min(a[i],b[i])-height[i]);
         }
         return sum;
    }
}