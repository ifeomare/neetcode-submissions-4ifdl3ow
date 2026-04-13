class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> numSet = new HashSet<Integer>();
        for (int i: nums) {
            if (numSet.contains(i))
                return true;
            else
                numSet.add(i);
        }
        return false;
    }
}