1class Solution {
2    public int numSubseq(int[] nums, int target) {
3        Arrays.sort(nums);
4        int mod = 1000000007;
5        int left = 0;
6        int right = nums.length - 1;
7        int cnt = 0;
8
9        int[] power = new int[nums.length];
10        power[0] = 1;
11        for(int i=1; i<nums.length; i++){
12            power[i] = (power[i-1] * 2) % mod;
13        }
14
15        while(left <= right){
16            if(nums[left] + nums[right] <= target){
17                cnt = (cnt + power[right-left]) % mod;
18                left++;
19            }
20            else{
21                right--;
22            }
23        }
24        return cnt;
25
26
27
28
29    }
30}