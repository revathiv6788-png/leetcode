class Solution {
    public int pivotInteger(int n) {
        int a=(n*(n+1))/2;
        int x=(int)Math.sqrt(a);
        return x*x==a?x:-1;
    }
}