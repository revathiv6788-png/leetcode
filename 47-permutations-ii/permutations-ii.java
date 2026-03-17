class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
        boolean taken[]=new boolean[nums.length];
        backtrack(result,nums,temp,taken);
        return result;
    }
    public void backtrack(List<List<Integer>> result,int[] nums,List<Integer> temp,boolean[]taken)
    {
        if(nums.length==temp.size())
        {
            if(!result.contains(temp))
            {
            result.add(new ArrayList<>(temp));
            }
            return;
        }
        for(int i=0;i<nums.length;i++)
        {
            // if(!temp.contains(nums[i]))
            // {
            //      temp.add(nums[i]);
            // }
            // else
            // {
            //     continue;
            // }
            if(taken[i])
            {
                continue;
            }
            temp.add(nums[i]);
            taken[i]=true;
            backtrack(result,nums,temp,taken);
            temp.remove(temp.size()-1);
            taken[i]=false;

        }
}
}