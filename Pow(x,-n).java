1class Solution {
2    public double myPow(double x, int n) {
3        long N = n;
4        if(N < 0){
5            x = 1 / x;
6            N = -N;
7        }
8        return power(x , N);
9    }
10    public double power(double x, long n){
11        if(n == 0 ) return 1.0;
12        double half = power(x, n / 2);
13        if( n % 2 == 0 ) {
14            return half * half;
15        }
16        else{
17            return half * half * x;
18        }
19    }
20}