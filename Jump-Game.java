1class Solution {
2    public boolean canJump(int[] nums) {
3        int maxIdx = 0;
4        for(int i=0; i<nums.length; i++){
5            if( i > maxIdx){
6                return false;
7            }
8            maxIdx = Math.max(maxIdx, i + nums[i]);
9
10        }
11        return true;
12    }
13}