class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;
        Set<Integer> st=new TreeSet<>();
        for(int i=0;i<n;i++)
        {
            st.add(nums[i]);
        }
        int i=0;
        for(int num:st)
        {
            nums[i++]=num;
        }
        return st.size();
    }
}