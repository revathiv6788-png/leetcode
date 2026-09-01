class Solution {
    public int distanceTraveled(int mainTank, int additionalTank) {
        int distance=0;
        while(mainTank>0)
        {
            mainTank--;
            distance=distance+10;
        if(additionalTank>0&&distance%50==0)
        {
            mainTank++;
            additionalTank--;
        }
        }
        return distance;
    }
}