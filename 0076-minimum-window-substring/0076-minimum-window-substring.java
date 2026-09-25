class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character, Integer> required = new HashMap<>();
        HashMap<Character, Integer> window = new HashMap<>();

        for (char c : t.toCharArray()) {
            required.put(c, required.getOrDefault(c, 0) + 1);
        }

        int left = 0;
        int formed = 0;
        int requiredCount = required.size();

        int minLength = Integer.MAX_VALUE;
        int start = 0;

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);

            window.put(c, window.getOrDefault(c, 0) + 1);

            if (required.containsKey(c) &&
                window.get(c).intValue() == required.get(c).intValue()) {
                formed++;
            }

            while (formed == requiredCount) {
                if (right - left + 1 < minLength) {
                    minLength = right - left + 1;
                    start = left;
                }

                char leftChar = s.charAt(left);
                window.put(leftChar, window.get(leftChar) - 1);

                if (required.containsKey(leftChar) &&
                    window.get(leftChar) < required.get(leftChar)) {
                    formed--;
                }
                left++;
            }
        }
        return minLength == Integer.MAX_VALUE
                ? ""
                : s.substring(start, start + minLength);
    }
}