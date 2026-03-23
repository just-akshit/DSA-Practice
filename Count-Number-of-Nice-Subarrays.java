1class Solution {
2    public int numberOfSubarrays(int[] nums, int k) {
3        return number(nums, k) - number(nums, k - 1);
4    }
5    private int number(int[] nums, int k){
6        if(k < 0) return 0;
7
8        int l=0, r=0, cnt=0, sum=0;
9        int n = nums.length;
10        while(r<n){
11            sum += (nums[r] % 2);
12            while( sum > k){
13                sum -= (nums[l] % 2);
14                l++;
15            }
16            cnt += (r-l+1);
17            r++;
18        }
19        return cnt;
20    }
21}