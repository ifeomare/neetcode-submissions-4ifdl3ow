class Solution {
    public int maxArea(int[] heights) {
                // area = length x width
        // width: right - left
        // length: minimum of the two numbers

        // int max = 0
        // traverse the array : brute force
        // left pointer from 0 to final
            // right pointer from 0+1 to final
                // Math.max(max, right-left * Math.min(left, right))
        // return max
        int maxArea = 0;
        int left = 0;
        int right = heights.length - 1;
        while (left < right) {
            maxArea = Math.max(maxArea, (right - left) * Math.min(heights[left], heights[right]));
            if (heights[left] >= heights[right])
                right--;
            else if (heights[right] > heights[left])
                left++;
        }
        return maxArea;
    }
}
