class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();

        int k = p.length();

        for (int i = 0; i <= s.length() - k; i++) {
            int[] countS = new int[26];
            int[] countP = new int[26];

            for (int j = i; j < i + k; j++) {
                countS[s.charAt(j) - 'a']++;
            }

            for (int j = 0; j < k; j++) {
                countP[p.charAt(j) - 'a']++;
            }

            if (Arrays.equals(countS, countP)) {
                result.add(i);
            }
        }
        return result;
    }
}