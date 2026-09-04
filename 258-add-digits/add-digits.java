class Solution {
    public int addDigits(int num) {
        // int sum=0;
        // while(sum<10)
        // {
        // while(num>0)
        // {
        //     int digit=num%10;
        //     sum+=digit;
        // }
        // }
        // return sum;


        // if(num==0)
        // return 0; 
        // if(num%9==0) return 9;
        // return num%9;

        //or

        if(num==0)
        return 0;
        return (num-1)%9+1;//this is work for 9 divisor
    }
}