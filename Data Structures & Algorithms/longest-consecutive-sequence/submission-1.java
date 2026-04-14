class Solution {
    public int longestConsecutive(int[] nums) {
        // Question: how do we deal with empty arrays: return 0?
        // convert array to ArrayList
        // count = 0
        // max = highest consecutive sequence so far
        
        // traverse the ArrayList
        // if pointer is the start / pointer - 1 does not exist = the start
            // count = 1
            // while pointer + 1 exists:
                // count ++;
                // pointer = pointer + 1
            // max = Math.max(max, count)
        List<Integer> numsList = Arrays.stream(nums).boxed().collect(Collectors.toList());
        int count = 0;
        int longest = 0;

        for (Integer num : numsList) {
            count = 1;
            if (numsList.contains(num+1)) {
                while (numsList.contains(num+1)) {
                    count++;
                    num++;
                }
            }
            longest = Math.max(longest, count);
        }
        return longest;
    }
}
