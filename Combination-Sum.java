1class Solution {
2    public List<List<Integer>> combinationSum(int[] candidates, int target) {
3        List<List<Integer>> ans = new ArrayList<>();
4        findComb(0, candidates, target, ans, new ArrayList<>());
5        return ans;
6
7    }
8    private void findComb(int i, int[] arr, int target, List<List<Integer>> ans, List<Integer> list){
9        if(i == arr.length){
10            if(target == 0){
11                ans.add(new ArrayList<>(list));
12            }
13            return;
14        }
15        if(arr[i] <= target){
16            list.add(arr[i]);
17            findComb(i, arr, target - arr[i], ans, list );
18            list.remove(list.size() - 1);
19        }
20        findComb(i+1, arr, target, ans, list);
21    }
22}