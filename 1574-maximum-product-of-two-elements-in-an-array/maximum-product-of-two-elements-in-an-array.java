class Solution {
    public int maxProduct(int[] nums) {
        Queue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int num:nums)
        {
            pq.add(num);
        }
        return (pq.poll()-1)* (pq.poll()-1);
    }
}