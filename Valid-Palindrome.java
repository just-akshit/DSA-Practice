1class Solution {
2    public boolean isPalindrome(String s) {
3        StringBuilder sb = new StringBuilder();
4        for(char ch : s.toCharArray()){
5            if(Character.isLetterOrDigit(ch)){
6                sb.append(Character.toLowerCase(ch));
7            }
8        }
9        int left = 0, right = sb.length() - 1; 
10        while(left <= right){
11            if(sb.charAt(left) != sb.charAt(right)){
12                return false;
13            }
14            left++;
15            right--;
16        }
17        return true;
18    }
19}