1class Solution {
2    public int longestConsecutive(int[] nums) {
3        int len = 0;
4        int n = nums.length;
5        HashSet<Integer> set = new HashSet<>();
6
7        for (int i : nums) {
8            set.add(i);
9        }
10
11        for (int i : set) {
12            if (!set.contains(i - 1)) {
13
14                int curr = i;
15                int cnt = 1;
16
17                while (set.contains(curr + 1)) {
18                    curr++;
19                    cnt++;
20                }
21                len = Math.max(len, cnt);
22            }
23        }
24        return len;
25    }
26}