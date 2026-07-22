class Solution {
    public int maxArea(int[] heights) {
        int left=0;
        int right=heights.length-1;
        int maxArea=0;
        while(left<right)
        {
            int w=right-left;
            int minHeight=Math.min(heights[left],heights[right]);
            int area=w*minHeight;
            maxArea=Math.max(area,maxArea);
            if(heights[left]<heights[right])
            {
                left++;
            }
            else
            right--;
        
    }
        return maxArea;
        
    }
}
