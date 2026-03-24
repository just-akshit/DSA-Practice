1class Solution {
2    public int jump(int[] nums) {
3        int cnt = 0;
4        int maxIdx = 0;
5        int j = 0;
6        for(int i=0; i<nums.length - 1; i++){
7            maxIdx = Math.max(maxIdx, i + nums[i]);
8            if(i==j){
9                cnt++;
10                j = maxIdx;
11            }
12        }
13        return cnt;
14    }
15}