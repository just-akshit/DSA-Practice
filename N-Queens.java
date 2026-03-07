1class Solution {
2    public List<List<String>> solveNQueens(int n) {
3        List<List<String>> ans = new ArrayList<>();
4        char[][] board = new char[n][n];
5
6        for(int i=0; i<n; i++){
7            Arrays.fill(board[i], '.');
8        }
9
10        int[] leftRow = new int[n];
11        int[] lowerD = new int[2*n-1];
12        int[] upperD = new int[2*n-1];
13        solve(0, board, ans, leftRow, lowerD, upperD, n);
14        return ans;
15    }
16    public static void solve(int col, char[][] board, List<List<String>> ans, int[] leftRow, int[] lowerD, int[] upperD, int n){
17        
18        if(col == n){
19            List<String> temp = new ArrayList<>();
20            for(int i=0; i<n; i++){
21                temp.add(new String(board[i]));
22            }
23            ans.add(temp);
24            return;
25        }
26        for(int row = 0; row<n; row++){
27            if(leftRow[row] == 0 && lowerD[row + col] == 0 && upperD[n -1 + col - row] == 0){
28
29                board[row][col] = 'Q';
30
31                //recursion
32                leftRow[row] = 1;
33                lowerD[row + col] = 1;
34                upperD[n -1 + col - row] = 1;
35
36                solve(col + 1, board, ans, leftRow , lowerD, upperD, n);
37
38                board[row][col] = '.';
39
40                //backtracing
41                leftRow[row] = 0;
42                lowerD[row + col] = 0;
43                upperD[n -1 + col - row] = 0;
44
45            }
46        }
47    }
48
49}