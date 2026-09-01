class Solution {
    public int arrangeCoins(int n) {
        int count=0;
        for(int i=1;n>0;i++)
        {
            n=n-i;
            count++;
        }
        if(n<0)
        {
            return count-1;
        }
        else
        {
            return count;
        }
    }
}