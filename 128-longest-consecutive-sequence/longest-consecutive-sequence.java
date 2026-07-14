// class Solution {
//     public int longestConsecutive(int[] nums) {
//         int count=1;
//         int count1=0;
//         int n=nums.length;
//         Arrays.sort(nums);
//         for(int i=1;i<n;i++)
//         {
//             if(n==1)
//             {
//                 return 1;
//             }
//            else if(nums[i]-nums[i-1]==1)
//            {
//                count++;
//                if(count>count1)
//                {
//                 count1=count;
//                }
//            }
//            else if(nums[i-1]==nums[i])
//            {
//             continue;
//            }
//            else
//            {
//             count=1;
//            }
//         }
//         return count1;
//     }
// }





class Solution {
    public int longestConsecutive(int[] nums) {

        int n = nums.length;

        if (n == 0) return 0;
        if (n == 1) return 1;

        int count = 1;
        int count1 = 1;

        Arrays.sort(nums);

        for (int i = 1; i < n; i++) {

            if (nums[i] - nums[i - 1] == 1) {
                count++;
                if (count > count1) {
                    count1 = count;
                }
            }
            else if (nums[i - 1] == nums[i]) {
                continue;
            }
            else {
                count = 1;
            }
        }

        return count1;
    }
}