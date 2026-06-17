class Solution {
    // what is included in the 256 ASCII characters?

    // writing two functions
        // encode: put together the strings, separated by a specific sequence
        // decode: spliterator/regex to split the string≠
    public String encode(List<String> strs) {
        // initialize answer string = "a54≠b4"
        // traverse the strs list
            // append pointer to answer + "a54≠b4"
        // return answer
        String code = "a54≠b4";
        String answer = code;
        if (!strs.isEmpty()) {
            for (String str : strs) {
                answer = answer + str + code;
            }
        }
        return answer;
    }

    public List<String> decode(String str) {
        // libraries: regex
        // initialize List<String> (ArrayList)
        // traverse string: while or for loop
        // while the string is not empty
        // for: stop when the string is empty = str.length > 0
            // determine the first occurance of "a54≠b4" - 6 letters
            // word = first letter to the first occrance of "a54≠b4"
            // append word to arraylist
            // adjust str to be the first unsearched letter to the end of our string
                // (word+6 letters, the end of the string)
        List<String> answer = new ArrayList<>();
        String code = "a54≠b4"; // defining code word
        int i = 0; // i always at 0
        int end;
        String word;
        str = str.substring(6); // remove the first occurance of code
        while (!str.isEmpty()) { 
            end = str.indexOf("a54≠b4");// word ends at the first occurance of code
            word = str.substring(i, end);
            answer.add(word); // append the word to answer list
            // START: length of word -> word.length() + 5
            str = str.substring(word.length() + 6); // adjust str string to exclude word
        }
        return answer;
    }
}
