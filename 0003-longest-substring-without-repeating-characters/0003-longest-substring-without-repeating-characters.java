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