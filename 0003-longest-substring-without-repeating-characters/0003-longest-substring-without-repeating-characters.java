class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;

        for (int i = 0; i < s.length(); i++) {
            boolean[] seen = new boolean[128];

            for (int j = i; j < s.length(); j++) {
                char c = s.charAt(j);

                if (seen[c]) {
                    break;
                }
                seen[c] = true;
                maxLength = Math.max(maxLength, j - i + 1);
            }
        }
        return maxLength;
    }
}