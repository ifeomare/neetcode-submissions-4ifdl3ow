class Solution {
    public int trap(int[] height) {
        int[] leftMaxes = new int[height.length];
        int[] rightMaxes = new int[height.length];
        int[] min = new int[height.length];

        int left = 0, right = height.length - 1;
        //int leftMax = 0, rightMax = 0;
        // what about with 0 and the last element?
        while (++left < height.length && --right >= 0) {
            if (left == 0 || right == height.length - 1) {
                // this means we are at the beginning of the iterat.
                // set leftMaxes[left] = 0 and right = 0
                leftMaxes[left] = 0;
                rightMaxes[right] = 0;
            } else {
                leftMaxes[left] = Math.max(leftMaxes[left - 1], height[left - 1]);
                rightMaxes[right] = Math.max(rightMaxes[right + 1], height[right + 1]);
            }
        }

        int sum = 0;
        for (int i = 0; i < height.length; i++) {
            int result = Math.min(leftMaxes[i], rightMaxes[i]) - height[i];
            if (result > 0) 
            {
                sum += result;
            }
        }

        return sum;
    }
}
