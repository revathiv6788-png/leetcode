class Solution {
    public int findKthLargest(int[] nums, int k) {
        
        // int count=0;
        //  for(int i=0;i<k;i++)
        //  {
        //      count++;
        //      if(count==k)
        //  {
        //     return nums[count-1];
        //  }
            Arrays.sort(nums);
            return nums[nums.length-k];
         }
    }
