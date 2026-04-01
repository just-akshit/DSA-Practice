1class Solution {
2    public int[][] merge(int[][] intervals) {
3        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
4
5        List<int[]> ans = new ArrayList<>();
6        int[] curr = intervals[0];
7
8        for(int i=1; i<intervals.length; i++){
9            if(intervals[i][0] <= curr[1]){
10                curr[1] = Math.max(curr[1], intervals[i][1]);
11            }
12            else{
13                ans.add(curr);
14                curr = intervals[i];
15            }
16        }
17        ans.add(curr);
18        return ans.toArray(new int[ans.size()][]);
19
20    }
21}