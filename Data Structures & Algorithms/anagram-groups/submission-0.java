class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        HashMap<String, List<String>> anagrams = new HashMap<>();

        for (String org : strs) {
            // sort in ascending order
            char[] alphChar = org.toCharArray();
            Arrays.sort(alphChar);
            String alph = new String(alphChar);
            if (!anagrams.containsKey(alph)) {
                ArrayList<String> val = new ArrayList<>();
                val.add(org);
                anagrams.put(alph, val);
            } else {
                anagrams.get(alph).add(org);
            }
        }
        Collection anagramsColl = anagrams.values();
        result = new ArrayList<>(anagramsColl);
        return(result);
    }
}
