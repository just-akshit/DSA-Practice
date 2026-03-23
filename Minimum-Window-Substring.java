1class Solution {
2    public String minWindow(String s, String t) {
3        Map<Character, Integer> mpp = new HashMap<>();
4        int cnt =0, minLen = Integer.MAX_VALUE;
5        int sIdx = -1;
6        int m = s.length();
7        int n = t.length();
8        int l=0, r=0;
9        for(int i=0; i<n; i++){
10            mpp.put(t.charAt(i), mpp.getOrDefault(t.charAt(i),0)+1);
11        }
12         while(r < m){
13
14            if(mpp.containsKey(s.charAt(r))){
15                if(mpp.get(s.charAt(r)) > 0){
16                    cnt++;
17                }
18                mpp.put(s.charAt(r), mpp.get(s.charAt(r)) - 1);
19            }
20
21            while(cnt == n){
22                if(r - l + 1 < minLen){
23                    minLen = r - l + 1;
24                    sIdx = l;
25                }
26
27                if(mpp.containsKey(s.charAt(l))){
28                    mpp.put(s.charAt(l), mpp.get(s.charAt(l)) + 1);
29                    if(mpp.get(s.charAt(l)) > 0){
30                        cnt--;
31                    }
32                }
33
34                l++;
35            }
36
37            r++;
38        }
39
40        return sIdx == -1 ? "" : s.substring(sIdx, sIdx + minLen);
41
42    }
43}