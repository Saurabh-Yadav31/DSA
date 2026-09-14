class Solution {
    public int maxVowels(String s, int k) {
        int count = 0;
        int maxCount = 0;

        // First window
        for (int i = 0; i < k; i++) {
            if (isVowel(s.charAt(i))) {
                count++;
            }
        }
        maxCount = count;

        // Slide the window
        for (int i = k; i < s.length(); i++) {

            // Remove the character leaving the window
            if (isVowel(s.charAt(i - k))) {
                count--;
            }
            // Add the character entering the window
            if (isVowel(s.charAt(i))) {
                count++;
            }
            maxCount = Math.max(maxCount, count);
        }
        return maxCount;
    }
    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
/*
1. Initialize `count = 0` to store the number of vowels in the current window.
2. Initialize `maxCount = 0` to store the maximum number of vowels found.
3. Count the vowels in the first `k` characters of the string.
4. Set `maxCount = count`.
5. Start sliding the window from index `k` to the end:
   - Remove the character leaving the window (`i - k`).
   - If it is a vowel, decrement `count`.
   - Add the character entering the window (`i`).
   - If it is a vowel, increment `count`.
   - Update `maxCount`.
6. Return `maxCount`.
Time Complexity: O(n)
Space Complexity: O(1)
*/