class Solution {
    public int[] productExceptSelf(int[] nums) {
        //  input: int[], Output: int[]
        // output[int], length = nums.length
        // iterate through the given array, nums
            // product (switch statements):
                // first index -> nums[i+1] for product, j = 1
                // middle and last -> nums[0], j = 0
            // while (j<nums.length)
                // if j!=i
                    // product *= j
                // else (j=i)
                    // j++
            // output[i] = product
        // return output

        int[] output = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int product = 1;
            int j;
            switch (i) {
                case 0:
                    j = 1;
                default:
                    j = 0;
            }
            while (j < nums.length) {
                if (j != i){
                    product *= nums[j];
                    j++;
                }
                else
                    j++;
            }
            output[i] = product;
        }
        return output;
    }
}  
