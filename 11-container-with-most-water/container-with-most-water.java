class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int maxstorearea=0;
        while(left<right)
        {
            int h=Math.min(height[left],height[right]);
            int width=right-left;
            int storearea=h*width;
            maxstorearea=Math.max(maxstorearea,storearea);
            if(height[left]<height[right])
            {
                left++;
            }
            else
            {
                right--;
            }
        }
        return maxstorearea;
    }
}