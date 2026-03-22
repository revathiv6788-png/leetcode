class Solution {
    public int majorityElement(int[] nums) {
        // int n=nums.length;
        // HashMap<Integer,Integer> map=new HashMap<>();//but ithu space o(n)
        // for(int num:nums)
        // {
        //     map.put(num,map.getOrDefault(num,0)+1);
        // }
        // for(int key:map.keySet())
        // {
        //     if(map.get(key)>n/2)
        //     {
        //         return key;
        //     }
        // }
        // return -1;



        //o(1) space complexcity boyer moore algorithm
        int candidate = 0;
        int count = 0;
        for (int num : nums) {
            if (count == 0) {//first time 2 if um work agum
                candidate = num;
            }
            if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }
        return candidate;
    }
}