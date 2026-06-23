1class Solution {
2    public List<List<Integer>> threeSum(int[] nums) {
3        int n = nums.length;
4        Arrays.sort(nums);
5        List<List<Integer>> ans = new ArrayList<>();
6        for(int i=0; i<n; i++){
7           if(i>0 && nums[i] == nums[i-1]) continue;
8           int j = i+1;
9           int k = n-1;
10           while(j<k){
11            int sum = nums[i] + nums[j] + nums[k];
12            if(sum < 0){
13                j++;
14            }
15            else if(sum > 0){
16                k--;
17            }
18            else{
19                List<Integer> temp = Arrays.asList(nums[i], nums[j], nums[k]);
20                ans.add(temp);
21                j++;
22                k--;
23                while(j<k && nums[j] == nums[j-1]) j++;
24                while(j<k && nums[k] == nums[k+1]) k--;
25            }
26           }
27        }
28        return ans;
29    }
30}
31
32// Better Solution => O()
33// class Solution {
34//     public List<List<Integer>> threeSum(int[] nums) {
35//         int n = nums.length;
36//         HashSet<List<Integer>> ans = new HashSet<>();
37//         for(int i=0; i<n; i++){
38//             HashSet<Integer> set = new HashSet<>();
39//             for(int j=i+1; j<n; j++){
40//                 int k = -(nums[i] + nums[j]);
41//                 if(set.contains(k)){
42//                     List<Integer> temp = Arrays.asList(nums[i], nums[j], k);
43//                     Collections.sort(temp);
44//                     ans.add(temp);
45//                 }
46//                 set.add(nums[j]);
47//             }
48//         }
49//         return new ArrayList<>(ans);
50//     }
51// }
52
53
54// Brute Force = O(N^2) and  2 * O(no. of triplets)
55// class Solution {
56//     public List<List<Integer>> threeSum(int[] nums) {
57//         int n = nums.length;
58//         HashSet<List<Integer>> set = new HashSet<>();
59//         for(int i=0; i<n; i++){
60//             for(int j=i+1; j<n; j++){
61//                 for(int k=j+1; k<n; k++){
62//                     if(nums[i] + nums[j] + nums[k] == 0){
63//                         List<Integer> temp = Arrays.asList(nums[i], nums[j], nums[k]);
64//                         Collections.sort(temp);
65//                         set.add(temp);
66//                     }
67//                 }
68//             }
69//         }
70//         return new ArrayList<>(set);
71//     }
72// }