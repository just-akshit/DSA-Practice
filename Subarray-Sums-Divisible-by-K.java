1class Solution {
2    public int subarraysDivByK(int[] nums, int k) {
3        HashMap<Integer, Integer> map = new HashMap<>();
4        map.put(0,1);
5        int n = nums.length;
6        if(n==0) return 0;
7        int cnt = 0;
8        int prefix = 0;
9        for(int i =0; i<n; i++){
10            prefix += nums[i];
11            int rem = prefix % k;
12            if(rem < 0){
13                rem += k;
14            }
15            cnt += map.getOrDefault(rem,0);
16            map.put(rem, map.getOrDefault(rem, 0) + 1);
17        }
18        return cnt;
19
20    }
21}
22
23// Brute Force = O(N^2)
24// class Solution {
25//     public int subarraysDivByK(int[] nums, int k) {
26//         int n = nums.length;
27//         if(n==0) return 0;
28//         int cnt = 0;
29//         for(int i =0; i<n; i++){
30//             int sum = 0;
31//             for(int j=i; j<n; j++){
32//                 sum += nums[j];
33//                 if(sum % k == 0){
34//                     cnt++;
35//                 }
36//             }
37//         }
38//         return cnt;
39//     }
40// }
41