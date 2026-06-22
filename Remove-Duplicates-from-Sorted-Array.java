1class Solution {
2    public int removeDuplicates(int[] nums) {
3        int n = nums.length;
4        if(n==0) return 0;
5        int slow = 0;
6        for(int fast=1; fast<n; fast++){
7            if(nums[fast] != nums[slow]){
8                slow++;
9                nums[slow] = nums[fast];
10            }
11        }
12        return slow + 1;
13    }
14}