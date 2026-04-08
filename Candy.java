1class Solution {
2    public int candy(int[] ratings) {
3        int sum = 1, i = 1;
4        int n = ratings.length;
5        while(i<n){
6            if(ratings[i] == ratings[i-1]){
7                sum++;
8                i++;
9                continue;
10            }
11            int peak = 1;
12            while(i<n && ratings[i] > ratings[i-1]){
13                peak++;
14                sum += peak;
15                i++;
16            }
17            int down = 1;
18            while(i<n && ratings[i] < ratings[i-1]){
19                sum += down;
20                i++;
21                down++;
22            }
23            if(down > peak){
24                sum += (down - peak);
25            }
26        }
27        return sum;
28    }
29}