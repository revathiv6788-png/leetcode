class Solution {
    public int findKthLargest(int[] nums, int k) {
        Queue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int num:nums)
        {
            pq.add(num);
        }
        while(k>1)//it is works if k=2 remove 1 element and return peek element
        {
            pq.poll();
            k--;
        }
        return pq.poll();
    }
}