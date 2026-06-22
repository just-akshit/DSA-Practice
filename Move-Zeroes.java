1class Solution {
2    public void moveZeroes(int[] nums) {
3        int n = nums.length;
4        int slow = 0;
5        
6        for(int fast = 0; fast<n; fast++){
7            if(nums[fast] != 0){
8                int temp = nums[fast];
9                nums[fast] = nums[slow];
10                nums[slow] = temp;
11                slow++;
12            }
13        }
14    }
15}