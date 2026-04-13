class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() == t.length()){
            ArrayList<String> myList = new ArrayList<String>();
            for (int i = 0; i < t.length(); i++)
                myList.add(t.substring(i, i+1));

            for (int i = 0; i < s.length(); i++) {
                String letter = s.substring(i, i+1);
                if (myList.contains(letter))
                    myList.remove(letter);
                else
                    return false;
            }
            return true;
        } else
            return false;
    }
}
