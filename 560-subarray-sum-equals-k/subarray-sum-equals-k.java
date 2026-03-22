class Solution {
    public int subarraySum(int[] nums, int k) {
    //     int left=0; sliding window varathu
    //     int count=0;
    //     for(right=0;right<k;right++)
    //     {
    //         if(nums[right]==k)
    //         {
    //             count++;
    //         }
    //         while(sum<)
    //     }


        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1); // important first time eh kkku equal ah vantha use agum
        int sum = 0;
        int count = 0;
        for (int num : nums) {
            sum += num;
            if (map.containsKey(sum - k)) {
                count += map.get(sum - k);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
}

    