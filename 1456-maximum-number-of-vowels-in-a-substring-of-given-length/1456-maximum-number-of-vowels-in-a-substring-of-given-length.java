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