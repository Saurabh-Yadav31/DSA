class Solution {
    public boolean repeatedSubstringPattern(String s) {
        String doubled = s + s;
        String result = doubled.substring(1, doubled.length() - 1);

        return result.contains(s);
    }
}
/*
Algorithm
1. Concatenate the string with itself and store it in doubled.
2. Remove the first and last characters of doubled using substring(1, doubled.length() - 1).
3. Check whether the resulting string contains the original string s.
4. If it contains s, return true; otherwise, return false.

- Time Complexity: Typically \(O(n^2)\) in the worst case for Java's String.contains() implementation.
- Space Complexity: \(O(n)\) for the concatenated and resulting strings.
*/