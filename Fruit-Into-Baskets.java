1class Solution {
2    public int totalFruit(int[] fruits) {
3        int k = 2;
4        int n = fruits.length;
5        Map<Integer, Integer> freq = new HashMap<>();
6        int l=0, r=0, maxLen = 0;
7        while(r<n){
8            freq.put(fruits[r], freq.getOrDefault(fruits[r], 0)+1);
9            if(freq.size() > k){
10                if(freq.size() > k){
11                    freq.put(fruits[l], freq.get(fruits[l]) - 1);
12                    if(freq.get(fruits[l]) == 0){
13                        freq.remove(fruits[l]);
14                    }
15                    l++;
16                }
17            }
18            if(freq.size() <= k){
19                maxLen = Math.max(maxLen, r-l+1);
20            }
21            r++;
22        }
23        return maxLen;
24    }
25}