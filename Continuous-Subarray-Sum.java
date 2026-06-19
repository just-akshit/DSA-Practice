1class Solution {
2    public boolean checkSubarraySum(int[] nums, int k) {
3        HashMap<Integer, Integer> map = new HashMap<>();
4        map.put(0, -1);
5        int n = nums.length;
6        int prefix = 0;
7        for (int i = 0; i < n; i++) {
8            prefix += nums[i];
9            int rem = prefix % k;
10            if(map.containsKey(rem)){
11                if(i-map.get(rem) > 1){
12                    return true;
13                }
14            }
15            else{
16                map.put(rem, i);
17            }
18        }
19        return false;
20
21    }
22}
23
24// // Brute Force -> O(N^2)
25// class Solution {
26//     public boolean checkSubarraySum(int[] nums, int k) {
27//         int len = 2;
28//         int n = nums.length;
29//         for (int i = 0; i < n; i++) {
30//             int sum = 0;
31//             for (int j = i; j < n; j++) {
32//                 sum += nums[j];
33//                 if (j - i + 1 >= len && sum % k == 0) {
34//                     return true;
35//                 }
36//             }
37//         }
38//         return false;
39//     }
40// }