class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // input: int[], k; Output: [n,...]
        // given an int[] and k, return the k most elements in the arr

        // Question: Are the elements always sorted (ascending/descending)?
        // We're assuming it's not already sorted!

        // Steps:
            // 1. Initialize HashMap and an Array of List<Integer>
            // 2. Traverse the array and initialize esch List as an ArrayList
            // 3. Traverse nums array and input elements inside HashMap
                // in <element, freq> form
            // 4. Traverse HashMap and enter items into array based on their
                // value(frequency): array[frequency] = element
            // 5. Traverse array backwards and input items into the answer array
                // until k elements are inside the answer array
            // 6. return answer
        Map<Integer, Integer> numsMap = new HashMap<>();
        List<Integer>[] bucketList = new List[nums.length + 1]; // why + 1?

        for (int i = 0; i < bucketList.length; i++)
            bucketList[i] = new ArrayList<>();

        for (int num : nums) {
            numsMap.put(num, numsMap.getOrDefault(num, 0) + 1);
        }
        numsMap.forEach( (num, v) -> bucketList[v].add(num));

        int index = 0;
        int[] answer = new int[k];
        for (int i = bucketList.length - 1; i > 0; i--) {
            for (Integer n : bucketList[i]) {
                answer[index++] = n;
                if (index == k)
                    return answer;
            }
        }
        return answer;
        //for (Map<Integer, Integer> entry : numsMap) {
            //bucketList[entry. ].add(entry. );
        //}
    }
}
