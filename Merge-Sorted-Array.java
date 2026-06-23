1class Solution {
2    public void merge(int[] nums1, int m, int[] nums2, int n) {
3        int[] ans = new int[m+n];
4        int i=0, j=0, k=0;
5        while(i<m && j<n){
6            if(nums1[i] <= nums2[j]){
7                ans[k++] = nums1[i++];
8            }
9            else{
10                ans[k++] = nums2[j++];
11            }
12        }
13        while(i<m){
14            ans[k++] = nums1[i++];
15        }
16        while(j<n){
17            ans[k++] = nums2[j++];
18        }
19        for(int x=0; x<m+n; x++){
20            nums1[x] = ans[x];
21        }
22    }
23}