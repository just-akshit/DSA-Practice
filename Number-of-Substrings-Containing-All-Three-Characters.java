1class Solution {
2    public int numberOfSubstrings(String s) {
3        int[] freq = new int[3];
4        int l=0, r=0, cnt=0;
5        int n = s.length();
6        int len = s.length() - 1;
7        while(r<n){
8            freq[s.charAt(r) - 'a']++;
9            while(freq[0] > 0 && freq[1] > 0 && freq[2] > 0){
10                cnt += len - r + 1;
11                freq[s.charAt(l) - 'a']--;
12                l++;
13            }
14            r++;
15        }
16        return cnt;
17    }
18}