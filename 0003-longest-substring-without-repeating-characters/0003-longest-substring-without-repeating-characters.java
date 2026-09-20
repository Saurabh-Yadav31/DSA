class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int maxLength = 0;
        boolean[] seen = new boolean[128];

        for (int right = 0; right < s.length(); right++) {
            while (seen[s.charAt(right)]) {
                seen[s.charAt(left)] = false;
                left++;
            }
            seen[s.charAt(right)] = true;
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }
}
/* Algorithm: Variable sliding window
1.Initialize left = 0, maxLength = 0, and a boolean array seen to track characters in the current window.
2.Traverse the string using right.
3.If the current character is already present in the window:
    3(a).Remove characters from the left.
    3(b).Move left forward until the duplicate character is removed.
4.Add the current character to the window.
5.Calculate the current window length using right - left + 1.
6.Update maxLength if the current window is longer.
7.Return maxLength.

Time Complexity: O(n)
Space Complexity: O(1) — assuming ASCII characters.
*/
