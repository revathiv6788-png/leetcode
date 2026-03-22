class Solution {
    public int missingNumber(int[] nums) {
        //int n=nums.length;
        //xor operator
        // int result=0;
        // for(int i=0;i<=n;i++)
        // {
        //     result^=i;
        // }
        // for(int num:nums)
        // {
        //     result^=num;
        // }
        // return result;


        //sum formula n*(n+1)/2
        int n=nums.length;
        int total=n*(n+1)/2;
        int sum=0;
        for(int num:nums)
        {
            sum+=num;
        }
        return total-sum;
    }
}