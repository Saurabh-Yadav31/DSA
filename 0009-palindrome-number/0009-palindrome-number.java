class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0)
            return false;
        String s = Integer.toString(x);

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right))
                return false;
            left++;
            right--;
        }
        return true;   
    }
}
// Algorithm:
// 1. If x is negative, return false because negative numbers are not palindromes.
// 2. Convert the integer x into a String.
// 3. Initialize two pointers:
//      left = 0
//      right = last index of the String.
// 4. While left < right:
//      - Compare the characters at left and right.
//      - If they are different, return false.
//      - Move left forward and right backward.
// 5. If all corresponding characters match, return true.
//Time Complexity: O(n)
//Space Complexity: O(n)