1class Solution {
2    public int characterReplacement(String s, int k) {
3        int[] hash = new int[26];
4        int l=0, r=0, cnt=0, maxLen =0, maxF = 0;
5        int n = s.length();
6        while(r<n){
7            hash[s.charAt(r) - 'A']++;
8            maxF = Math.max(maxF, hash[s.charAt(r) - 'A']);
9            if((r-l+1) - maxF > k){
10                hash[s.charAt(l) - 'A']--;
11                l++;
12            }
13            if((r-l+1) - maxF <= k){
14                maxLen = Math.max(maxLen, r-l+1);
15            }
16            r++;
17
18        }
19        return maxLen;
20    }
21}