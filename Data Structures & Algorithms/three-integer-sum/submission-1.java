class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // sort the array
        // traverse the array with three pointers
            // left is the anchor pointer
            // middle(left+1) and right(size-1): regular two sum
            // if left + right + middle = 0
                // add to list
        // return list
        List<List<Integer>> answer = new ArrayList<>();
        Arrays.sort(nums);
        for (int left = 0; left < nums.length; left++) {
            if (left > 0 && nums[left] == nums[left - 1])
                continue;
            
            int middle = left + 1, right = nums.length - 1;
            while (middle < right) {
                if (nums[left] + nums[middle] + nums[right] > 0)
                    right--;
                else if (nums[left] + nums[middle] + nums[right] < 0)
                    middle++;
                else {
                    answer.add(List.of(nums[left], nums[middle++], nums[right]));
                    while (middle < right && nums[middle] == nums[middle - 1]){
                        middle++;
                    }
                }
            }
        }
        return answer;
    }
}
