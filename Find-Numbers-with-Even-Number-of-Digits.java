1class Solution {
2    public int findNumbers(int[] nums) {
3        int cnt = 0;
4        for(int num : nums){
5            if(even(num)){
6                cnt++;
7            }
8        }
9        return cnt;
10    }
11    static boolean even(int num){
12        int numOfDigits = digits(num);
13        if(numOfDigits % 2 == 0){
14            return true;
15        }
16        return false;
17    }
18    static int digits(int num){
19        if(num < 0){
20            num *= -1;
21        }
22        return (int)(Math.log10(num)) + 1;
23    }
24}