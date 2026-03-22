class Solution {
    public int singleNumber(int[] nums) {
        int result=0;//bit manibulation without using extra space
        for(int i:nums)
        {
            result=result^i;
        }
        return result;
    }
}