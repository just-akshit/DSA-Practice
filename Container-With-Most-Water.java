1class Solution {
2    public int maxArea(int[] height) {
3        int n = height.length;
4        int res = 0;
5        int l = 0;
6        int r = n - 1;
7        while (l < r) {
8            int area = (r-l) * Math.min(height[l], height[r]);
9            res = Math.max(res, area);
10            if(height[l] < height[r]){
11                l++;
12            }
13            else{
14                r--;
15            }
16        }
17        return res;
18    }
19}
20
21// // Brute Force => O(N^2)
22// class Solution {
23//     public int maxArea(int[] height) {
24//        int n = height.length;
25//        int res = 0; 
26//        for(int left = 0; left<n; left++){
27//             for(int right = left + 1; right<n; right++){
28//                 int area = (right - left) * Math.min(height[right], height[left]);
29//                 res = Math.max(res, area);
30//             }
31//        }
32//        return res;
33//     }
34// }