class Solution {
    public int maxArea(int[] height) {
        int maxLen=0, l=0, r=height.length-1;
        while(l<r)
        {
            int area=Math.min(height[r], height[l])*(r-l);
            maxLen=Math.max(area, maxLen);
            if(height[l]<height[r]) l++;
            else r--;
        }
        return maxLen;
    }
}