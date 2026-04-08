1class Solution {
2    public int climbStairs(int n) {
3        int[] dp = new int[n+1];
4        return climb(n, dp);
5    }
6    private int climb(int n, int[] dp){
7        if(n==0 || n==1) return 1;
8        if(dp[n] != 0){
9            return dp[n];
10        }
11        dp[n] = climb(n-1,dp) + climb(n-2,dp);
12        return dp[n];
13    }
14}