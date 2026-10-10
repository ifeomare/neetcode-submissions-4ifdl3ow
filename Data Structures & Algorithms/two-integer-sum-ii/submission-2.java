class Solution {
    public int[] twoSum(int[] numbers, int target) {
        // traverse array
        // while x > y
            // if left + right > target
                // right - 1
            // if left + right < target
                // left + 1
            // equal
                //return left, right
        int left = 0;
        int right = numbers.length - 1;
        while (left < right) {
            if ((numbers[left] + numbers[right]) > target)
                right--;
            else if ((numbers[left] + numbers[right]) < target)
                left++;
            else
                return new int[]{left+1, right+1};
        }
        return new int[]{left+1, right+1};
    }
}
