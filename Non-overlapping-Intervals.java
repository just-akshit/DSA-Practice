1class Solution {
2    public int eraseOverlapIntervals(int[][] intervals) {
3        Arrays.sort(intervals, Comparator.comparingInt(a -> a[1]));
4
5        int cnt = 0;
6        int n = intervals.length;
7        int end = intervals[0][1];
8
9        for(int i=1; i<n; i++){
10            if(intervals[i][0] < end){
11                cnt++;
12            }
13            else{
14                end = intervals[i][1];
15            }
16        }
17        return cnt;
18    }
19}