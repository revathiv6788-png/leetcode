class Solution {
    public String makeGood(String s) {
        Stack<Character> st=new Stack<>();
        // String str="";
        // for(int i=0;i<s.length();i++)
        // {
        //     char ch=s.charAt(i);
        //     if(st.isEmpty())
        //     {
        //         st.push(ch);
        //     }
        //     else
        //     {
        //         if(Math.abs(ch-st.pop().equals(ch)))
        //         {
        //             st.pop(ch);
        //         }
        //         else
        //         {
        //             st.push(ch);
        //         }
        //     }
        //     if(st.isEmpty)
        //     {
        //         return str;
        //     }
        //     else
        //     {
        //         while(!st.isEmpty)
        //         {
        //             str=st.pop()+s;
        //         }
        //     }
        // }
        // return str;
        for(char ch:s.toCharArray())
        {
         if (!st.isEmpty() && Math.abs(st.peek() - ch) == 32) {
          st.pop();
            }
            else
            {
                st.push(ch);
            }
        }
        StringBuilder sb=new StringBuilder();
        for(char c:st)
        {
            sb.append(c);
        }
        return sb.toString();
    }
}