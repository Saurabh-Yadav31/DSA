class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();

        if (p.length() > s.length()) {
            return result;
        }
        int[] countP = new int[26];
        int[] countWindow = new int[26];

        int k = p.length();

        // Frequency of characters in p
        for (int i = 0; i < k; i++) {
            countP[p.charAt(i) - 'a']++;
        }
        // First window
        for (int i = 0; i < k; i++) {
            countWindow[s.charAt(i) - 'a']++;
        }
        // Check first window
        if (Arrays.equals(countP, countWindow)) {
            result.add(0);
        }
        // Slide the window
        for (int i = k; i < s.length(); i++) {
            countWindow[s.charAt(i) - 'a']++;
            countWindow[s.charAt(i - k) - 'a']--;

            if (Arrays.equals(countP, countWindow)) {
                result.add(i - k + 1);
            }
        }
        return result;
    }
}