class Solution {
    public int findDuplicate(int[] nums) {
        Set<Integer> set=new HashSet<>();
        for(int num:nums)
        {
            // if(!set.contains(num))
            // {
            //     set.add(num);
            // }
            if(!set.add(num))//add boolean type
            {
                return num;
            }
        } 
        return -1;       
    }
}