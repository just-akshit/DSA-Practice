1class Solution {
2    public int lengthOfLongestSubstring(String s) {
3        Set<Character> set = new HashSet<>();
4        int l = 0;
5        int maxLen = 0;
6        for(int r=0; r<s.length(); r++){
7            while(set.contains(s.charAt(r))){
8                set.remove(s.charAt(l));
9                l++;
10            }
11            set.add(s.charAt(r));
12            maxLen = Math.max(maxLen, r - l + 1);
13        }
14        return maxLen;
15    }
16}