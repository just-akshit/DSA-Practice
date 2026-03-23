1class Solution {
2    public int maxScore(int[] cardPoints, int k) {
3        int l=0, r=0;
4        for(int i=0; i<k; i++){
5            l += cardPoints[i];
6        }
7        int maxSum = l;
8        int rIdx = cardPoints.length - 1;
9
10        for(int j = k-1; j>=0; j--){
11            l -= cardPoints[j];
12            r += cardPoints[rIdx];
13            rIdx--;
14
15            maxSum = Math.max(maxSum, l+r);
16
17        }
18        return maxSum;
19    }
20}