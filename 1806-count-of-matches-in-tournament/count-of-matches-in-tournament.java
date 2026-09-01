class Solution {
    public int numberOfMatches(int n) {
        int matches=0;
        int team=n;
        while(team>1)
        {
            matches+=team/2;
            if(team%2==0)
            {
                team=team/2;
            }
            else
            {
                team=(team/2)+1;
            }
        }
        return matches;
    }
}