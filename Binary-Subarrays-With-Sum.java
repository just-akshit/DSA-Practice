1class Solution {
2    public int numSubarraysWithSum(int[] nums, int goal) {
3       return atMost(nums, goal) - atMost(nums, goal-1);
4    }
5    private int atMost(int[] nums, int goal){
6        int head, tail = 0;
7        int n = nums.length;  
8        int sum = 0;
9        int cnt = 0;
10        for(head = 0; head<n; head++){
11            sum += nums[head];
12            while(sum > goal && tail <= head){
13                sum -= nums[tail];
14                tail++;
15            }
16            cnt += head - tail + 1;
17        }
18        return cnt;
19    }
20}
21
22// Brute Force - O(n^2)
23
24// class Solution {
25//     public int numSubarraysWithSum(int[] nums, int goal) {
26//         int n = nums.length;
27//         int cnt = 0;
28//         for(int i=0; i<n; i++){
29//             int sum = 0;
30//             for(int j=i; j<n; j++){
31//                 sum += nums[j];
32//                 if(sum == goal){
33//                     cnt++;
34//                 }
35//             }
36//         }
37//         return cnt;
38//     }
39// }