class Solution {
    public int strStr(String haystack, String needle) {

        int n = haystack.length();
        int m = needle.length();

        for (int i = 0; i <= n - m; i++) {
            int j = 0;
            while (j < m && haystack.charAt(i + j) == needle.charAt(j)) {
                j++;
            }
            if (j == m) {
                return i;
            }
        }
        return -1;
    }
}
/*
1. Calculate the lengths of haystack and needle, storing them in n and m.
2. Traverse haystack using pointer i from index 0 to n - m.
3. For each position i, initialize pointer j = 0.
4. Compare characters of haystack starting at i with characters of needle using j.
5. While the characters match, increment j and continue comparing.
6. If j == m, all characters of needle match; return i.
7. If no match is found after checking all possible positions, return -1.
Complexity
- Time Complexity: O(n*m)in the worst case, up to m characters are compared at each of the n - m + 1 starting positions.
- Space Complexity: (O(1)only a constant number of variables are used.
*/