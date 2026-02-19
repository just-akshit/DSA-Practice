1class Solution {
2    public int maximumWealth(int[][] accounts) {
3        int ans = accounts[0][0];
4        int n = accounts.length;
5        for(int i=0; i<n; i++){
6            int sum = 0;
7            for(int j=0; j<accounts[i].length; j++){
8                sum += accounts[i][j];   
9            }
10            if(sum > ans){
11                    ans = sum;
12                }
13        }
14        return ans;
15    }
16}