class Solution {
    public boolean judgeCircle(String moves) {
        // int x=0;
        // int y=0;
        // for(int i=0;i<moves.length();i++)
        // {
        //     char ch=moves.charAt(i);
        //     if(ch=='L')
        //     {
        //         x--;
        //     }
        //     else if(ch=='R')
        //     {
        //         x++;
        //     }
        //     else if(ch=='U')
        //     {
        //         y++;
        //     }
        //     else
        //     {
        //         y--;
        //     }
        // }
        // return x==0&&y==0;


        int count1=0;
        int count2=0;
        int count3=0;
        int count4=0;
        for(int i=0;i<moves.length();i++)
        {
            char ch=moves.charAt(i);
            if(ch=='L')
            {
                count1++;
            }
            else if(ch=='R')
            {
                count2++;
            }
            else if(ch=='D')
            {
                count3++;
            }
            else
            {
                count4++;
            }
        }
        return count1==count2&&count3==count4;
    }
}