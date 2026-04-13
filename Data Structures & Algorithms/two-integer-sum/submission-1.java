class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] targetInd = new int[2];
        HashMap<Integer, Integer> numsCopy = new HashMap<>();
        int i = 0; // traversing nums array
        int diff = target - nums[i]; // the value we're looking for -> nums[i] + diff = target
        while (!numsCopy.containsValue(diff)){ // while we have not found the value
            numsCopy.put(i, nums[i]); // add nums[i] to the HashMap
            i += 1; // increment i by 1
            diff = target - nums[i]; // adjust the value of diff to match the current value of i
        }
        targetInd[1] = i;
        for (int j = 0; j < numsCopy.size(); j++) {
            if (numsCopy.get(j) == diff)
                targetInd[0] = j;
        }
        return targetInd;
    }
}
