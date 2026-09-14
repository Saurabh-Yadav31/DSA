class Solution {
    public int maxVowels(String s, int k) {
        int n = s.length();
        int[] prefix = new int[n + 1];

        for (int i = 0; i < n; i++) {
            prefix[i + 1] = prefix[i];

            char c = s.charAt(i);

            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                prefix[i + 1]++;
            }
        }

        int maxCount = 0;

        for (int i = 0; i <= n - k; i++) {
            int count = prefix[i + k] - prefix[i];
            maxCount = Math.max(maxCount, count);
        }

        return maxCount;
    }
}