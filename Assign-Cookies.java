1class Solution {
2    public int findContentChildren(int[] g, int[] s) {
3        int m = s.length, n = g.length;
4        int l=0, r=0;
5        Arrays.sort(g);
6        Arrays.sort(s);
7
8        while(l<m && r<n){
9            if(g[r] <= s[l]){
10                r++;
11            }
12            l++;
13        }
14        return r;
15    }
16}