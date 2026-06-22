1class Solution {
2    public void reverseString(char[] s) {
3        int left = 0;
4        int right = s.length -1 ;
5
6        while(left < right){
7
8            char temp = s[left];
9            s[left] = s[right];
10            s[right] = temp;
11
12            left++;
13            right--;
14        }
15    }
16}
17
18
19
20// not in-place memory => O(N) and O(N)
21
22// class Solution {
23//     public void reverseString(char[] s) {
24
25//         StringBuilder sb = new StringBuilder();
26//         for(char ch : s){
27//             sb.append(s);
28//         }
29//         sb.reverse();
30//         for(int i=0; i<s.length; i++){
31//             s[i] = sb.charAt(i);
32//         }
33//     }
34// }