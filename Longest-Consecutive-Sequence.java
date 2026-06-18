1class Solution {
2    public int longestConsecutive(int[] nums) {
3        int n = nums.length;
4        HashSet<Integer> set = new HashSet<>();
5        int longest = 1;
6        if(n==0) return 0;
7        for(int i=0; i<n; i++){
8            set.add(nums[i]);
9        }
10        for(int num : set){
11            if(!set.contains(num - 1)){
12                int curr = num;
13                int cnt = 1;
14                while(set.contains(curr + 1)){
15                    curr++;
16                    cnt++;
17                }
18            longest = Math.max(longest, cnt);
19            }
20        }
21        return longest;
22    }
23}
24
25
26// Better Approach O(N) * O(Nlogn) = O(NlognN);
27// class Solution {
28//     public int longestConsecutive(int[] nums) {
29//         int cnt = 0;
30//         int n = nums.length;
31//         int lastSmaller = Integer.MIN_VALUE;
32//         int longest = 1;
33//         Arrays.sort(nums);
34//         for(int i=0; i<n; i++){
35//             if(nums[i] - 1 == lastSmaller){
36//                 cnt++;
37//                 lastSmaller = nums[i];
38//             }
39//             else if(nums[i] != lastSmaller){
40//                 cnt = 1;
41//                 lastSmaller = nums[i];
42//             }
43//             longest = Math.max(longest, cnt);
44//         }
45//         return longest;
46//     }
47// }
48
49
50
51
52// Brute Force O(N^2)
53// class Solution {
54//     public int longestConsecutive(int[] nums) {
55//         int n = nums.length;
56//         int longest = 1;
57//         for(int i=0; i<n; i++){
58//             int curr = nums[i];
59//             int cnt = 1;
60//             while(search(nums, curr + 1)){
61//                 curr++;
62//                 cnt++;
63//             }
64//             longest = Math.max(longest, cnt);
65//         }
66//         return longest;
67//     }
68//     private boolean search(int[] nums, int target){
69//         for(int i=0; i<nums.length; i++){
70//             if(nums[i] == target) return true;
71//         }
72//         return false;
73//     }
74// }