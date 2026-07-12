class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int res = 0;
        int l = 0;
        int h = n-1;
        while(l<h){
            int area = (h-l) * Math.min(height[l], height[h]);
            res = Math.max(area, res);
            if(height[l] < height[h]){
                l++;
            }
            else{
                h--;
            }
        }
        return res;
    }
}