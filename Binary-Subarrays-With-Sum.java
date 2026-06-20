1class Solution {
2    public int numSubarraysWithSum(int[] nums, int goal) {
3        // HashMap<Integer, Integer> map = new HashMap<>();
4        // map.put(0,1);
5        int n = nums.length;
6        int cnt = 0;
7        for(int i=0; i<n; i++){
8            int sum = 0;
9            for(int j=i; j<n; j++){
10                sum += nums[j];
11                if(sum == goal){
12                    cnt++;
13                }
14            }
15        }
16        return cnt;
17
18    }
19}