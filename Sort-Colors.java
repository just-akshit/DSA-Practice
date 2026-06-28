1class Solution {
2    public void sortColors(int[] nums) {
3        int n = nums.length;
4        int l=0, m=0, h = n-1;
5        while(m<=h){
6            if(nums[m] == 0){
7                int temp = nums[l];
8                nums[l] = nums[m];
9                nums[m] = temp;
10                l++;
11                m++;
12            }
13            else if(nums[m] == 1){
14                m++;
15            }
16            else{
17                int temp = nums[m];
18                nums[m] = nums[h];
19                nums[h] = temp;
20                h--;
21            }
22        }
23    }
24}