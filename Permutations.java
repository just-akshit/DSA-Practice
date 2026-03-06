1class Solution {
2    public List<List<Integer>> permute(int[] nums) {
3        List<List<Integer>> ans = new ArrayList<>();
4        recur(0, nums, ans);
5        return ans;
6        
7    }
8    private void swap(int i, int j, int[] nums){
9        int temp = nums[i];
10        nums[i] = nums[j];
11        nums[j] = temp;
12    }
13    private void recur(int idx, int[] nums, List<List<Integer>> ans){
14        if(idx == nums.length){
15            List<Integer> ds = new ArrayList<>();
16            for(int i=0; i<nums.length; i++){
17                ds.add(nums[i]);
18            }
19            ans.add(new ArrayList<>(ds));
20            return;
21        }
22        for(int i=idx; i<nums.length; i++){
23            swap(i, idx, nums);
24            recur(idx + 1, nums, ans);
25            swap(i, idx, nums);
26        }
27    }
28    
29}
30    //     List<List<Integer>> ans = new ArrayList<>();
31    //     List<Integer> ds = new ArrayList<>();
32    //     boolean freq[] = new boolean[nums.length];
33    //     permutation(nums, ans, ds, freq);
34    //     return ans;
35
36    // }
37    // private void permutation(int[] nums, List<List<Integer>> ans, List<Integer> ds, boolean freq[]){
38    //     int n = nums.length;
39    //     if(ds.size() == n){
40    //         ans.add(new ArrayList<>(ds));
41    //         return;
42    //     }
43    //     for(int i=0; i<n; i++){
44    //         if(!freq[i]){
45    //             freq[i] = true;
46    //             ds.add(nums[i]);
47    //             permutation(nums, ans, ds, freq);
48    //             ds.remove(ds.size() - 1);
49    //             freq[i] = false;
50    //         }
51    //     }