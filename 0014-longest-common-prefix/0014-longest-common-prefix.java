class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < strs[0].length(); i++) {
            char current = strs[0].charAt(i);

            for (int j = 1; j < strs.length; j++) {
                if (i >= strs[j].length() || strs[j].charAt(i) != current) {
                    return result.toString();
                }
            }
            result.append(current);
        }
        return result.toString();
    }
}
/*
Algorithm — Longest Common Prefix
1. Start from the first character of the first string.
2. Compare that character with the character at the same position in every other string.
3. If all characters match, add the character to the result.
4. If any character does not match or a string ends, return the result.
5. Continue until all possible characters are checked.
6. Return the common prefix.
Time Complexity: O(n × m)
Space Complexity: O(1) excluding the output string.
*/