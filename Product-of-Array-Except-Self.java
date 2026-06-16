1class Solution {
2    public int[] productExceptSelf(int[] nums) {
3        int n = nums.length;
4        int ans[] = new int[n];
5        ans[0] = 1;
6        for(int i=1; i<n; i++){
7            ans[i] = ans[i-1] * nums[i-1];
8        }
9        int right = 1;
10        for(int i= n-1; i>=0; i--){
11            ans[i] *= right;
12            right *= nums[i];
13        }
14        return ans;
15    }
16}
17
18
19
20// class Solution {
21//     public int[] productExceptSelf(int[] nums) {
22//         int n = nums.length;
23//         int[] prefix = new int[n];
24//         int[] suffix = new int[n];
25//         int[] ans = new int[n];
26
27//         prefix[0] = 1;
28//         for(int i=1; i<n; i++){
29//             prefix[i] = prefix[i-1] * nums[i-1];
30//         }
31//         suffix[n-1] = 1;
32//         for(int i=n-2; i>=0; i--){
33//             suffix[i] = suffix[i+1] * nums[i+1];
34//         }
35//         for(int i=0; i<n; i++){
36//             ans[i] = prefix[i] * suffix[i];
37//         }
38//         return ans;
39//     }
40// }
41
42
43// class Solution {
44//     public int[] productExceptSelf(int[] nums) {
45//         int n = nums.length;
46//         int[] ans = new int[n];
47//         for(int i= 0; i<n; i++){
48//             int product = 1;
49//             for(int j=0; j<n; j++){
50//                 if(i!=j){
51//                     product *= nums[j];
52//                 }
53//             }
54//             ans[i] = product;
55//         }
56//         return ans;
57//     }
58// }