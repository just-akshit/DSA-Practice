1class Solution {
2    public int uniquePaths(int m, int n) {
3        int ans[][] = new int[m][n];
4        
5        for(int i=0; i<m; i++){
6            Arrays.fill(ans[i], -1);
7        }
8        return path(m-1,n-1,ans);
9    }
10    public int path(int i, int j, int ans[][]){
11        if(i==0 || j==0) return 1;
12        if(ans[i][j] != -1){
13            return ans[i][j];
14        }
15        return ans[i][j] = path(i-1,j,ans) + path(i,j-1,ans);
16    }
17}