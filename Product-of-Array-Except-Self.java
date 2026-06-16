1class Solution {
2    public int[] productExceptSelf(int[] nums) {
3        int n = nums.length;
4        int[] prefix = new int[n];
5        int[] suffix = new int[n];
6        int[] ans = new int[n];
7
8        prefix[0] = 1;
9        for(int i=1; i<n; i++){
10            prefix[i] = prefix[i-1] * nums[i-1];
11        }
12        suffix[n-1] = 1;
13        for(int i=n-2; i>=0; i--){
14            suffix[i] = suffix[i+1] * nums[i+1];
15        }
16        for(int i=0; i<n; i++){
17            ans[i] = prefix[i] * suffix[i];
18        }
19        return ans;
20    }
21}
22
23
24// class Solution {
25//     public int[] productExceptSelf(int[] nums) {
26//         int n = nums.length;
27//         int[] ans = new int[n];
28//         for(int i= 0; i<n; i++){
29//             int product = 1;
30//             for(int j=0; j<n; j++){
31//                 if(i!=j){
32//                     product *= nums[j];
33//                 }
34//             }
35//             ans[i] = product;
36//         }
37//         return ans;
38//     }
39// }