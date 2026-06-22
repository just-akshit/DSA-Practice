1class Solution {
2    public int[] twoSum(int[] numbers, int target) {
3        int n = numbers.length;
4        int sum = 0;
5        int left = 0;
6        int right = n-1;
7        while(left <= right){
8            sum = numbers[left] + numbers[right];
9            if(sum < target){
10                left++;
11            }
12            else if(sum > target){
13                right--;
14            }
15            else{
16                return new int[]{left+1, right+1};
17            }
18        }
19        return new int[]{};
20    }
21}
22// Brute Force - O(N^2);
23// class Solution {
24//     public int[] twoSum(int[] numbers, int target) {
25//         int n = numbers.length;
26//         int sum = 0;
27//         for(int i=0; i<n; i++){
28//             for(int j=0; j<n; j++){
29//                 sum = numbers[i] + numbers[j];
30//                 if(sum == target){
31//                     return new int[]{i+1,j+1};
32//                 }
33//             }
34//         }
35//         return new int[]{};
36//     }
37// }