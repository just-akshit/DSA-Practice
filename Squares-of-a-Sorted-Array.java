1class Solution {
2    public int[] sortedSquares(int[] nums) {
3        int n = nums.length;
4        int[] ans = new int[n];
5        int left = 0;
6        int right = n - 1;
7        int i = n-1;
8        while(left <= right) {
9            if(Math.abs(nums[left]) > Math.abs(nums[right])){
10                ans[i] = nums[left] * nums[left];
11                left++;
12            }
13            else{
14                ans[i] = nums[right] * nums[right];
15                right--;
16            }
17            i--;
18        }
19        return ans;
20    }
21}
22// Brute Force - O(N^2);
23// class Solution {
24//     public int[] sortedSquares(int[] nums) {
25//        int n = nums.length;
26//        int[] ans = new int[n];
27//        for(int i=0; i<n; i++){
28//         ans[i] = nums[i] * nums[i];
29//        } 
30//        Arrays.sort(ans);
31//        return ans;
32//     }
33// }