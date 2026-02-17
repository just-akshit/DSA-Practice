1class Solution {
2public:
3    vector<int> twoSum(vector<int>& nums, int target) {
4        for(int i=0 ; i<nums.size() ; i++){
5            for(int j=i+1; j<nums.size(); j++){
6                if(nums[i]+nums[j] == target){
7                    return {i,j};
8                }
9            }
10        }
11        return {};
12    }
13};
14
15/* using map for optimisation
16
17class Solution {
18public:
19    vector<int> twoSum(vector<int>& nums, int target) {
20        unordered_map<int, int>m;
21        int i = 0;
22for (int x : nums) {
23    int y = target - x;
24    if (m.find(y) != m.end()) {
25        return {m[y], i};
26    }
27    m[x] = i;
28    i++;
29}
30        return {};
31    }
32};
33*/