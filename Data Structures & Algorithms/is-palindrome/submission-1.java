class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        String reversedS = "";
        for (int i = 0; i < s.length(); i++)
            reversedS = s.charAt(i) + reversedS;
        return s.equalsIgnoreCase(reversedS);
    }
}
