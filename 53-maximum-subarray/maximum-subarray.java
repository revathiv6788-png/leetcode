class Solution {
    public int maxSubArray(int[] nums) {//kadanes algorithm
        int maxsum=nums[0];
        int cursum=0;
        for(int num:nums)
        {
            if(cursum<0)//negative
            {
                cursum=0;
            }
            cursum+=num;
            maxsum=Math.max(cursum,maxsum);
        }
        return maxsum;
    }
}