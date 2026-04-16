1class Solution {
2    public int minCostClimbingStairs(int[] cost) {
3        int n = cost.length;
4        int[] dp = new int[n];
5        Arrays.fill(dp, -1);
6        return Math.min(helper(cost, dp, n-1), helper(cost, dp, n-2));
7    }
8    public int helper(int[] cost, int[] dp, int i){
9        if(i==0 || i==1) return cost[i];
10        if(dp[i] != -1){
11            return dp[i];
12        }
13        dp[i] = cost[i] + Math.min(helper(cost, dp, i-1), helper(cost, dp, i-2));
14        return dp[i];
15    }
16}