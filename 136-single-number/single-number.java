class Solution {
    public int singleNumber(int[] nums) {
        // int result=0;//bit manibulation without using extra space
        // for(int i:nums)
        // {
        //     result=result^i;
        // }
        // return result;


        HashMap<Integer, Integer> map = new HashMap<>();

        // Count frequency
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Find element with count 1
        for (int key : map.keySet()) {
            if (map.get(key) == 1) {
                return key;
            }
        }

        return -1; 
    }
}