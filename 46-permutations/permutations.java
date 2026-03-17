class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
        backtrack(result,nums,temp);
        return result;
    }
    public void backtrack(List<List<Integer>> result,int[] nums,List<Integer> temp)
    {
        if(nums.length==temp.size())
        {
            result.add(new ArrayList<>(temp));
            return;
        }
        for(int i=0;i<nums.length;i++)
        {
            if(!temp.contains(nums[i]))
            {
                 temp.add(nums[i]);
            }
            else
            {
                continue;
            }
            backtrack(result,nums,temp);
            temp.remove(temp.size()-1);
        }
    }
}