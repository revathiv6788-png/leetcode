// class Solution {
//     public int compress(char[] chars) {
//         int n=chars.length();
//         int count=1;
//         int i=0;
//         String []=new String[n];
//         while(i<n)
//         {
//           if(chars[i]==chars[i+1])
//           {
//             count++;
//             i++;
//           }
//           else
//           {
//             count=1;
//           }
//           while(0)
//         }
//     }
// }



class Solution {
    public int compress(char[] chars) {
        int n = chars.length;
        int i = 0;
        int write = 0;
        while (i < n) {
            char current = chars[i];
            int count = 0;
            while (i < n && chars[i] == current) {
                count++;
                i++;
            }
            chars[write++] = current;
            if (count > 1) {
                String s = String.valueOf(count);
                for (char c : s.toCharArray()) {
                    chars[write++] = c;
                }
            }
        }
        return write;
    }
}