class Solution {
    public String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");
        StringBuilder result = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            result.append(words[i]);

            if (i > 0) {
                result.append(" ");
            }
        }
        return result.toString();
    }
}
/*
Algorithm: Reverse Words in a String (Using split() and StringBuilder)
1. Remove leading and trailing spaces from the input string using trim().
2. Split the string into words using split("\\s+") to handle multiple spaces.
3. Initialize a StringBuilder to store the result.
4. Traverse the words array from the last index to the first.
5. Append each word to the StringBuilder.
6. After appending each word, add a space if it is not the last word being appended.
7. Return the final string using toString().
Time Complexity: O(n)
Space Complexity: O(n)
*/