class Solution {
    public void rotate(int[] nums, int k) {
        // int count=0;
        // int ans[]=new int[num.length];
        // int i=0;
        // while(i<k)
        // {
        //     ans[0]=nums.length-1;
        //     for(int i=0;i<nums.length;i++)
        // {
        //     ans[i]=nums.length-1;
        // }
        // }

        int n=nums.length;
        k=k%n;//k=7,n=5,7%5 only 2 times enough
        reverse(nums,0,n-1);//reverse whole array
        reverse(nums,0,k-1);//reverse first k elements
        reverse(nums,k,n-1);//reverse remaining elements
    }
    public void reverse(int[] nums,int left,int right)
    {
        while(left<right)
        {
            int temp=nums[left];
            nums[left]=nums[right];
            nums[right]=temp;
            left++;
            right--;
        }
    }
}