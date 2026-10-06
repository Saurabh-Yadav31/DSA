class Solution {
    public boolean validPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return isPalindrome(s, left + 1, right) ||
                       isPalindrome(s, left, right - 1);
            }
            left++;
            right--;
        }
        return true;
    }

    private boolean isPalindrome(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
/*
Algorithm: Using pointers
1. Initialize two pointers, left at the beginning and right at the end.
2. Compare the characters at left and right.
3. If they are equal, move both pointers inward.
4. If they are different, use the one allowed deletion:
   - Skip the character at left and check whether the remaining substring is a palindrome.
   - Skip the character at right and check whether the remaining substring is a palindrome.
5. If either option forms a palindrome, return true.
6. If no mismatch occurs, return true.
Time Complexity: O(n)
Space Complexity: O(1)
*/