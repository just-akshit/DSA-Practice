1class Solution {
2    public int solve(int i, int j, ArrayList<Integer> arr, int[][] dp){
3        if(i > j) return 0;
4
5        if(dp[i][j] != -1) return dp[i][j];
6        int mini = Integer.MAX_VALUE;
7        for(int k=i; k<=j; k++){
8            int cost = (arr.get(j+1) - arr.get(i-1)) + solve(i, k-1, arr, dp) + solve(k+1, j, arr, dp);
9
10            mini = Math.min(cost, mini);
11        }
12        return dp[i][j] = mini;
13     }
14    public int minCost(int n, int[] cuts) {
15        ArrayList<Integer> list = new ArrayList<>();
16        for(int x : cuts){
17            list.add(x);
18        }
19        list.add(n);
20        list.add(0, 0);
21
22        int c = list.size();
23        Collections.sort(list);
24
25        int[][] dp = new int[c-1][c-1];
26
27        for(int[] row : dp){
28            Arrays.fill(row, -1);
29        }
30        return solve(1, c-2, list, dp);
31
32    }
33    
34}