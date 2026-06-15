1class NumArray {
2
3    int[] prefix;
4    public NumArray(int[] nums) {
5        int n = nums.length;
6        prefix = new int[n+1];
7        for(int i=0; i<n; i++){
8            prefix[i+1] = prefix[i] + nums[i];
9        }
10    }
11    
12    public int sumRange(int left, int right) {
13        return prefix[right + 1] - prefix[left];
14    }
15}
16
17/**
18 * Your NumArray object will be instantiated and called as such:
19 * NumArray obj = new NumArray(nums);
20 * int param_1 = obj.sumRange(left,right);
21 */