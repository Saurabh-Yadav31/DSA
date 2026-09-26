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