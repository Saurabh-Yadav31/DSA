class Solution {
    public boolean isSubsequence(String s, String t) {
        if (s.length() > t.length()) {
            return false;
        }
        int i = 0;
        int j = 0;

        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
            j++;
        }
        return i == s.length();
    }
}
/*
1. If length of s > length of t, return false.
2. Initialize i = 0 and j = 0.
3. Traverse both strings using i and j.
4. If s[i] == t[j], move both i and j forward.
5. Otherwise, move only j forward.
6. Continue until either string is completely traversed.
7. If i reaches the end of s, return true.
8. Otherwise, return false.
Time Complexity: O(n) where n is the length of t
Space Complexity: O(1)
*/