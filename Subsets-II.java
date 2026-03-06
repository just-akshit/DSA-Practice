1class Solution {
2    public List<List<Integer>> subsetsWithDup(int[] nums) {
3        Arrays.sort(nums);
4        List<List<Integer>> ans = new ArrayList<>();
5        List<Integer> list = new ArrayList<>();
6        sumWithoutDup(0,nums, list, ans);
7
8        return ans;
9
10    }
11    private void sumWithoutDup(int idx, int[] nums, List<Integer> list, List<List<Integer>> ans ){
12        int n = nums.length;
13        ans.add(new ArrayList<>(list));
14
15        for(int i = idx; i<n; i++){
16
17            if(i != idx && nums[i] == nums[i-1]) continue;
18
19            list.add(nums[i]);
20            sumWithoutDup(i + 1, nums, list, ans);
21            list.remove(list.size() - 1);
22        }
23
24    }
25}