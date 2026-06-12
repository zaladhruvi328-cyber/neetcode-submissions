class Solution {
    public int maxArea(int[] heights) {
        int i =0;
        int j = heights.length-1;
        int largestArea = 0;
        while(i<j)
        {
            int currentArea = (j-i)*Math.min(heights[i],heights[j]);
            largestArea = Math.max(currentArea,largestArea);
            if(heights[i]<=heights[j])
            {
                i++;
            }
            else
                j--;
            
        }
        return largestArea;
    }
}
