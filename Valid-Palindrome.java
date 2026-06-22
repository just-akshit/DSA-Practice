1class Solution {
2    public boolean isPalindrome(String s) {
3        int left = 0;
4        int right = s.length()-1 ;
5        while(left < right){
6            while(left < right && !Character.isLetterOrDigit(s.charAt(left))){
7                left++;
8            }
9            while(left < right && !Character.isLetterOrDigit(s.charAt(right))){
10                right--;
11            }
12            if(Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))){
13                return false;
14            }
15            left++;
16            right--;
17        }
18        return true;
19    }
20}
21
22
23// Brute Force = O(n) and O(N)
24// class Solution {
25//     public boolean isPalindrome(String s) {
26//         StringBuilder sb = new StringBuilder();
27//         for(char ch : s.toCharArray()){
28//             if(Character.isLetterOrDigit(ch)){
29//                 sb.append(Character.toLowerCase(ch));
30//             }
31//         }
32//         int left = 0, right = sb.length() - 1; 
33//         while(left <= right){
34//             if(sb.charAt(left) != sb.charAt(right)){
35//                 return false;
36//             }
37//             left++;
38//             right--;
39//         }
40//         return true;
41//     }
42// }