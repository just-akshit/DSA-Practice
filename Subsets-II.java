1class Solution {
2    public List<List<Integer>> subsetsWithDup(int[] nums) {
3        Arrays.sort(nums);
4        Set<List<Integer>> ans = new HashSet<>();
5        List<Integer> list = new ArrayList<>();
6        sumWithoutDup(0,nums, ans, list);
7
8        return new ArrayList<>(ans);
9
10    }
11    private void sumWithoutDup(int idx, int[] arr, Set<List<Integer>> ans, List<Integer> list){
12        int n = arr.length;
13        if(idx == n){
14            ans.add(new ArrayList<>(list));
15            return;
16        }
17        list.add(arr[idx]);
18        sumWithoutDup(idx + 1, arr, ans, list);
19        list.remove(list.size() - 1);
20        sumWithoutDup(idx + 1, arr, ans, list);
21    }
22}