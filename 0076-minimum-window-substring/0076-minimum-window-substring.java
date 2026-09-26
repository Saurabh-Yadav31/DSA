class Solution {
    public String minWindow(String s, String t) {
        int[] required = new int[128];
        int[] window = new int[128];

        for (char c : t.toCharArray()) {
            required[c]++;
        }

        int left = 0;
        int start = 0;
        int minLength = Integer.MAX_VALUE;

        int requiredChars = t.length();
        int formedChars = 0;

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            window[c]++;

            if (required[c] > 0 && window[c] <= required[c]) {
                formedChars++;
            }
            while (formedChars == requiredChars) {
                if (right - left + 1 < minLength) {
                    minLength = right - left + 1;
                    start = left;
                }

                char leftChar = s.charAt(left);
                window[leftChar]--;

                if (required[leftChar] > 0 &&
                    window[leftChar] < required[leftChar]) {
                    formedChars--;
                }
                left++;
            }
        }
        return minLength == Integer.MAX_VALUE
                ? ""
                : s.substring(start, start + minLength);
    }
}
/* Algorithm: Using Sliding Window
1.Create frequency arrays for required characters and current window.
2.Initialize left = 0, formedChars = 0, and minLength.
3.Expand the window by moving right.
4.Add the current character to the window frequency.
5.If the character is required and its frequency is within the required frequency, increment formedChars.
6.When formedChars == t.length(), the window is valid.
7.Update the minimum window and shrink it from the left.
8.When removing a required character makes the window invalid, decrement formedChars.
9.Continue until right reaches the end.
10.Return the minimum valid window, or "" if none exists.

Time Complexity: O(n + m)
Space Complexity: O(1)
*/