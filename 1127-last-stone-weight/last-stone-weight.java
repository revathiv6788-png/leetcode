class Solution {
    public int lastStoneWeight(int[] stones) {
        Queue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        //it works max heap so the value stored in ascending order
        for(int i=0;i<stones.length;i++)
        {
            pq.add(stones[i]);
        }
            while(pq.size()>1)//while
            {
                int a=pq.poll();
                int b=pq.poll();
                pq.add(a-b);
            }
        return pq.poll();
    }
}