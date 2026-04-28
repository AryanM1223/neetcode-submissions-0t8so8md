class Solution {
    public int maxArea(int[] heights) {
        int left = 0;
        int n = heights.length;
        int right = n - 1;
        int maxAra = 0;
        int area = 0;

        while(left <= right){
            area = Math.min(heights[left],heights[right])*(right - left);
            maxAra = Math.max(maxAra,area);
            if(heights[left]<heights[right]){
                left++;
            }
            else{
                right--;
            }
        }

        return maxAra;
    }
}
