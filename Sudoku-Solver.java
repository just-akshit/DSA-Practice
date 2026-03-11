1class Solution {
2    public void solveSudoku(char[][] board) {
3        solve(board);
4    }
5    public boolean solve(char[][] board){
6        for(int i=0; i<board.length; i++){
7            for(int j=0; j<board[i].length; j++){
8
9                if(board[i][j] == '.'){
10                    for(char c = '1'; c <= '9'; c++){
11                        if(isValid(board, i, j, c)){
12                            board[i][j] = c;
13
14                            if(solve(board) == true){
15                                return true;
16                            }
17                            else{
18                                board[i][j] = '.';
19                            }
20                        }
21                    }
22                    return false;
23                }
24            }
25        }
26        return true;
27    }
28    public boolean isValid(char[][] board, int row, int col, char c){
29        for(int i=0; i<9; i++){
30            if(board[i][col] == c){
31                return false;
32            }
33            if(board[row][i] == c){
34                return false;
35            }
36            if(board[3 * (row/3) + i/3][3 * (col/3) + i%3] == c){
37                return false;
38            }
39        }
40        return true;
41    }
42
43}