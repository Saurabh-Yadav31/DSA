class Solution {
    public int characterReplacement(String s, int k) {
        int left = 0;
        int maxFrequency = 0;
        int maxLength = 0;
        int[] count = new int[26];

        for (int right = 0; right < s.length(); right++) {
            int index = s.charAt(right) - 'A';
            count[index]++;

            maxFrequency = Math.max(maxFrequency, count[index]);

            while ((right - left + 1) - maxFrequency > k) {
                count[s.charAt(left) - 'A']--;
                left++;
            }
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }
}
/* Algorithm: Varaiable Sliding Window
1.Initialize left = 0, maxFrequency = 0, and maxLength = 0.
2.Create a frequency array to store the count of each character in the current window.
3.Traverse the string using right.
4.Add the current character to the frequency array.
5.Update maxFrequency with the highest frequency of any character in the current window.
6.Calculate the number of replacements needed:
    window length - maxFrequency
7.If the required replacements are greater than k, shrink the window:
    7(a)Decrease the frequency of the character at left.
    7(b)Move left forward.
8.Calculate the current valid window length and update maxLength.
9.Return maxLength.

Time Complexity: O(n)
Space Complexity: O(1)
*/