class Solution {
    public int dominantIndex(int[] nums) {
       Queue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
       for(int num:nums)
       {
        pq.add(num);
       }
       int max=pq.poll();
       while(!pq.isEmpty())
       {
          int x=pq.poll();
          if(x*2>max)
          {
            return -1;
          }
       }
       for(int i=0;i<nums.length;i++)
       {
        if(nums[i]==max)
        {
            return i;
        }
       }
       return -1;
    }
}