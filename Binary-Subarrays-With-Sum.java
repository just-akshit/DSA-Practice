1class Solution {
2    public int numSubarraysWithSum(int[] nums, int goal) {
3        return number(nums, goal) - number(nums, goal - 1);
4    }
5    private int number(int[] nums, int goal){
6        if(goal < 0) return 0;
7
8        int l=0, r=0, cnt=0, sum=0;
9        int n = nums.length;
10        while(r<n){
11            sum += nums[r];
12            while( sum > goal){
13                sum -= nums[l];
14                l++;
15            }
16            cnt += (r-l+1);
17            r++;
18        }
19        return cnt;
20    }
21}