class Solution {
    public String longestPalindrome(String s) {
        int start = 0;
        int maxLength = 0;

        for (int i = 0; i < s.length(); i++) {
            int len1 = expandAroundCenter(s, i, i);
            int len2 = expandAroundCenter(s, i, i + 1);

            int len = Math.max(len1, len2);

            if (len > maxLength) {
                maxLength = len;
                start = i - (len - 1) / 2;
            }
        }
        return s.substring(start, start + maxLength);
    }
    private int expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length()
                && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }
}
/*
1. Initialize start = 0 and maxLength = 0.
2. Traverse each character as a possible center of a palindrome.
3. Check for an odd-length palindrome by using the current character as the center.
4. Check for an even-length palindrome by using the current character and the next character as the center.
5. Expand outward while the characters on both sides are equal.
6. Get the length of the palindrome found.
7. If it is longer than the current maximum, update start and maxLength.
8. Return the substring starting at start with length maxLength.
Time Complexity: O(n²)
Space Complexity: O(1)
*/