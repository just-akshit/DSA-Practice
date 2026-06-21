1class Solution {
2    public int numberOfSubarrays(int[] nums, int k) {
3       return number(nums, k) - number(nums, k-1);
4    } 
5    private int number(int nums[] , int k){
6        if(k<0) return 0;
7        int n = nums.length;
8        int l=0, r=0;
9        int sum = 0;
10        int cnt = 0;
11        while(r < n){
12            sum += (nums[r] % 2);
13            while(sum > k){
14                sum -= (nums[l] % 2);
15                l++;
16            }
17            cnt += r - l + 1;
18            r++;
19        }
20        return cnt;
21    }
22}
23
24// Brute Force -> O(n^2)
25// class Solution {
26//     public int numberOfSubarrays(int[] nums, int k) {
27//         int n = nums.length;
28//         int cnt = 0;
29//         if(k<0) return 0;
30//         for(int i=0; i<n; i++){
31//             int oddCnt = 0;
32//             for(int j=i; j<n; j++){
33//                 if(nums[j] % 2 != 0){
34//                     oddCnt++;
35//                 }
36//                 if(oddCnt == k){
37//                     cnt++;
38//                 }
39//             }
40//         }
41//         return cnt;
42//     } 
43// }