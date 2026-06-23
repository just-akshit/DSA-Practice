1class Solution {
2    public boolean isSubsequence(String s, String t) {
3        int n = s.length();
4        int m = t.length();
5        int i=0, j=0;
6        while(i<n && j<m){
7            if(s.charAt(i) == t.charAt(j)){
8                i++;
9            }
10            j++;
11        }
12        if(i==n) return true;
13        return false;
14                
15    }
16}