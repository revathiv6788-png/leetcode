class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
    //    int left=0;
    //    int result[]=new int[temperatures.length];
    //    for(int right=0;right<temperatures.length;right++)
    //    {
    //     int count=1;
    //     if(temperatures[left]<temperatures[right])
    //     {
    //         result[left]=count;
    //         left++;
    //     }
    //     else
    //     {
    //         count++;
    //         right--;
    //     }
    //    }
    //    return result;
    Stack<Integer> st=new Stack<>();
    int results[]=new int[temperatures.length];
    for(int i=0;i<temperatures.length;i++)
    {
        while(!st.isEmpty()&&temperatures[st.peek()]<temperatures[i])
        {
            int index=st.pop();
            results[index]=i-index;
        }
        st.push(i);
    }
    return results;
    }
}