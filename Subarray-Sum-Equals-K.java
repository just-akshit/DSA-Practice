1class Solution {
2    public int subarraySum(int[] nums, int k) {
3        HashMap<Integer, Integer> map = new HashMap<>();
4        map.put(0,1);
5        int n = nums.length;
6        int prefixSum = 0;
7        int cnt = 0;
8        for(int i=0; i<n; i++){
9            prefixSum += nums[i];
10            int remove = prefixSum - k;
11            cnt += map.getOrDefault(remove, 0);
12            map.put(prefixSum, map.getOrDefault(prefixSum, 0)+ 1);
13        }
14        return cnt;
15
16    }
17}