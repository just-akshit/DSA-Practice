1class Solution {
2    public int subarraysWithKDistinct(int[] nums, int k) {
3       return diff(nums, k) - diff(nums, k - 1);
4    }
5    private int diff(int[] nums, int k){
6        int l=0, r=0, cnt=0;
7        int n = nums.length;
8        Map<Integer, Integer> freq = new HashMap<>();
9        while( r < n){
10            freq.put(nums[r], freq.getOrDefault(nums[r], 0) + 1);
11            while( freq.size() > k){
12                freq.put(nums[l], freq.get(nums[l]) - 1);
13                if(freq.get(nums[l]) == 0){
14                    freq.remove(nums[l]);
15                }
16                l++;
17            }
18            cnt += (r - l + 1);
19            r++;
20        }
21        return cnt;
22    }
23}