1class Solution {
2    public int lengthOfLIS(int[] nums) {
3        int[] arr = new int[nums.length];
4        int size = 0;
5        for(int i=0; i<nums.length; i++){
6
7            int pos = bs(arr, 0, size - 1, nums[i]);
8
9            arr[pos] = nums[i];
10
11            if(pos == size){
12                size++;
13            }
14        }
15        return size;
16
17    }
18    private int bs(int[] arr, int low, int high, int key){
19        while(low <= high){
20            int mid = (low + high)/2;
21            if(arr[mid] == key){
22                return mid;
23            }
24            else if(arr[mid] < key){
25                low = mid + 1;
26            }
27            else{
28                high = mid - 1;
29            }
30        }
31        return low;
32    }
33}