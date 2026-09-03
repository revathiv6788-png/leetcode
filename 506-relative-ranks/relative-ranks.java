class Solution {
    public String[] findRelativeRanks(int[] score) {
        // Queue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());//prority queue la index tha irukkum so entha index kku score athigama irukko athukku index set pannum
        // for(int n:score)
        // {
        //     pq.add(n);
        // }
        // Map<Integer,Integer>mp=new HashMap<>();
        // for(int i=0;i<scores) 

        Queue<Integer> pq=new PriorityQueue(Collections.reverseOrder());//prority queue la index tha irukkum so entha index kku score athigama irukko athukku index ah poll pannum
        int n=score.length;
        for(int m:score)
        {
            pq.add(m);
        }
        String[]ans=new String[score.length];
         int rank=1;
         while(!pq.isEmpty())
         {
        int max=pq.poll();
         for(int i=0;i<n;i++)
         {
            if(score[i]==max && ans[i]==null)
            {
               if(rank==1)
               {
                 ans[i]="Gold Medal";
               }
               else if(rank==2)
               {
                ans[i]="Silver Medal";
               }
               else if(rank==3)
               {
                ans[i]="Bronze Medal";
               }
               else
               {
                ans[i]=Integer.toString(rank);
               }
               break;
            }           
        }
         rank++;
         }
         return ans;
    }
}